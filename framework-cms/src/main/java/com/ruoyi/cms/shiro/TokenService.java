package com.ruoyi.cms.shiro;

import cn.hutool.core.date.DateUtil;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.redis.RedisCache;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.uuid.IdUtils;
import com.ruoyi.cms.domain.OssUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * token验证处理
 *
 * @author ruoyi
 */
@Component
@Slf4j
public class TokenService {
    // 令牌自定义标识
    @Value("${token.header}")
    private String header;

    // 令牌秘钥
    @Value("${token.secret}")
    private String secret;

    // 令牌有效期（默认30分钟）
    @Value("${token.expireTime}")
    private int expireTime;

    protected static final long MILLIS_SECOND = 1000;

    protected static final long MILLIS_MINUTE = 60 * MILLIS_SECOND;

    private static final Long MILLIS_MINUTE_TEN = 20 * 60 * 1000L;

    @Autowired
    private RedisCache redisCache;

    /**
     * 获取用户身份信息
     *
     * @return 用户信息
     */
    public OssUser getLoginUser(HttpServletRequest request) {
        // 获取请求携带的令牌
        String token = getToken(request);
        return this.getLoginUser(token);
    }

    public OssUser getLoginUser(String token) {
        // 去掉Bearer的前缀
        if (StringUtils.isNotEmpty(token) && token.startsWith(Constants.TOKEN_PREFIX)) {
            token = token.replace(Constants.TOKEN_PREFIX, "");
        }

        if (StringUtils.isNotEmpty(token)) {
            Claims claims = parseToken(token);
            // 解析对应的权限以及用户信息
            String uuid = (String) claims.get(Constants.OSS_USER_KEY);
            String userKey = getTokenKey(uuid);
            OssUser user = redisCache.getCacheObject(userKey);
            return user;
        }
        return null;
    }

    /**
     * 设置用户身份信息
     */
    public void setLoginUser(OssUser loginUser) {
        if (StringUtils.isNotNull(loginUser) && StringUtils.isNotEmpty(loginUser.getUuid())) {
            refreshToken(loginUser);
        }
    }

    /**
     * 删除用户身份信息
     */
    public void delLoginUser(String uuid) {
        if (StringUtils.isNotEmpty(uuid)) {
            String userKey = getTokenKey(uuid);
            redisCache.deleteObject(userKey);
        }
    }

    /**
     * 验证令牌有效期，相差不足20分钟，自动刷新缓存
     *
     * @param ossUser
     * @return 令牌
     */
    public void verifyToken(OssUser ossUser) {
        long expireTime = ossUser.getExpireTime();
        long currentTime = System.currentTimeMillis();
        if (expireTime - currentTime <= MILLIS_MINUTE_TEN) {
            refreshToken(ossUser);
            log.info("Token被后台刷新了");
        }
    }

    /**
     * 创建令牌
     *
     * @param ossUser 用户信息
     * @return 令牌
     */
    public String createToken(OssUser ossUser) {
        String uuid = IdUtils.fastUUID();
        ossUser.setUuid(uuid);
        ossUser.setExpireTime(DateUtil.current() + expireTime * MILLIS_MINUTE);
        refreshToken(ossUser);

        Map<String, Object> claims = new HashMap<>();
        // 用于获取redis里用户信息的UUID
        claims.put(Constants.OSS_USER_KEY, uuid);
        String token = createToken(claims);
        log.info("生成token ==> {} \n {}", uuid, token);
        return token;
    }

    /**
     * 刷新令牌有效期
     *
     * @param ossUser 登录信息
     */
    public void refreshToken(OssUser ossUser) {
        // 根据uuid将loginUser缓存
        String userKey = getTokenKey(ossUser.getUuid());
        redisCache.setCacheObject(userKey, ossUser, expireTime, TimeUnit.MINUTES);
    }


    /**
     * 从数据声明生成令牌
     *
     * @param claims 数据声明
     * @return 令牌
     */
    private String createToken(Map<String, Object> claims) {
        String token = Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512, secret).compact();
        return token;
    }

    /**
     * 从令牌中获取数据声明
     *
     * @param token 令牌
     * @return 数据声明
     */
    private Claims parseToken(String token) {
        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token)
                .getBody();
    }

    /**
     * 从令牌中获取用户名
     *
     * @param token 令牌
     * @return 用户名
     */
    public String getUsernameFromToken(String token) {
        Claims claims = parseToken(token);
        return claims.getSubject();
    }

    /**
     * 获取请求token
     *
     * @param request
     * @return token
     */
    private String getToken(HttpServletRequest request) {
        log.info("header: {} ==> ", header);
        String token = request.getHeader(header);
        log.info("token: {} ==> ", token);
        if (StringUtils.isNotEmpty(token) && token.startsWith(Constants.TOKEN_PREFIX)) {
            token = token.replace(Constants.TOKEN_PREFIX, "");
        }
        return token;
    }

    private String getTokenKey(String uuid) {
        return Constants.OSS_TOKEN_KEY + uuid;
    }
}
