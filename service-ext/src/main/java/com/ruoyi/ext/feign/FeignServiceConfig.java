package com.ruoyi.ext.feign;

import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 14:58
 */
@Configuration
@ConditionalOnClass({FeignService.class})
public class FeignServiceConfig {

    @Value("${feign-url.oss}")
    private String ossUrl;

    @Bean
    public FeignService buildFeignService() {
        return Feign.builder()
                .decoder(new JacksonDecoder())
                .encoder(new FeignSpringFormEncoder())
                .logger(new Logger.ErrorLogger())
                .logLevel(Logger.Level.BASIC)
                .target(FeignService.class, ossUrl);
    }

}
