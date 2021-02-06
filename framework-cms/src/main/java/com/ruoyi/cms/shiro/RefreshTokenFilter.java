package com.ruoyi.cms.shiro;

import com.ruoyi.cms.domain.OssUser;
import lombok.extern.slf4j.Slf4j;
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
        log.info("RefreshToken??");
        OssUser loginUser = tokenService.getLoginUser(request);
        if (loginUser != null) {
            tokenService.verifyToken(loginUser);
        }
        chain.doFilter(request, response);
    }
}
