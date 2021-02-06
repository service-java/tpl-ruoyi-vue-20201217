/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.mall.controller;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.exception.user.UserPasswordNotMatchException;
import com.ruoyi.common.redis.RedisCache;
import com.ruoyi.common.util.MessageUtils;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.mall.manager.AsyncFactory;
import com.ruoyi.mall.manager.AsyncManager;
import com.ruoyi.mall.security.TokenService;
import com.ruoyi.mall.security.login.LoginBody;
import com.ruoyi.mall.security.login.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Api(tags="Mall模块")
@RestController
@RequestMapping("/api/mall")
@Slf4j
public class MallController {

    @Autowired
    RedisCache redisCache;

    @Autowired
    TokenService tokenService;

    @Resource
    private AuthenticationManager authenticationManager;


    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @ApiOperation("登录")
    @PostMapping("/login")
    @ResponseBody
    public ResultVo login(@RequestBody LoginBody loginBody) {

        String username = loginBody.getUsername();
        String password = loginBody.getPassword();


        log.info("username {}; password {}", username, password);

        // 1) 用户名密码验证
        Authentication authentication = null;
        try {
            // 该方法会去调用UserDetailsServiceImpl.loadUserByUsername
            authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception e) {
            if (e instanceof BadCredentialsException) {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.password.not.match")));
                throw new UserPasswordNotMatchException();
            } else {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, e.getMessage()));
                throw new CustomException(e.getMessage());
            }
        }

        // 3) 登录验证通过
        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_SUCCESS, MessageUtils.message("user.login.success")));
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        // 生成token
        String token = tokenService.createToken(loginUser);

        return ResultVo.success().set(Constants.TOKEN, token);
    }

}
