package com.ruoyi.oss.shiro;

import com.ruoyi.common.util.StringUtils;

import com.ruoyi.oss.domain.OssUser;
import com.ruoyi.oss.service.TokenService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * token过滤器 验证token有效性
 *
 * @author ruoyi
 */
@Component
@Slf4j
public class RefreshTokenFilter extends OncePerRequestFilter {
    @Autowired
    private TokenService tokenService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        log.info("判断下是否需要RefreshToken ~~");
        OssUser loginUser = tokenService.getLoginUser(request);
        if (StringUtils.isNotNull(loginUser) && StringUtils.isNull(ShiroUtils.getUserId())) {
            tokenService.verifyToken(loginUser);
        }
        chain.doFilter(request, response);
    }
}
