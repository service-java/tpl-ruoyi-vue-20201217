package com.ruoyi.cms.redis;


import com.ruoyi.cms.domain.OssConfig;
import com.ruoyi.common.constant.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 系统配置Redis
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component
public class OssConfigRedisUtils {
    @Autowired
    private RedisUtils redisUtils;

    public void saveOrUpdate(OssConfig config) {
        if (config == null) {
            return;
        }
        String key = Constants.OSS_CONFIG_KEY + config.getParamKey();
        redisUtils.set(key, config);
    }

    public void delete(String configKey) {
        String key = Constants.OSS_CONFIG_KEY + configKey;
        redisUtils.delete(key);
    }

    public OssConfig get(String configKey) {
        String key = Constants.OSS_CONFIG_KEY + configKey;
        return redisUtils.get(key, OssConfig.class);
    }
}
