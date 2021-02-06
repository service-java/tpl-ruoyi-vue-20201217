package com.ruoyi.cms.controller;

import com.ruoyi.cms.shiro.ShiroUtils;
import com.ruoyi.common.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 10:16
 */
@Api(tags="公共模块")
@RestController
@RequestMapping("/api")
@Slf4j
public class CurrentUserController {


    @ApiOperation("currentUser")
    @GetMapping("/currentUser")
    public ResultVo currentUser() {
        return ResultVo.success(ShiroUtils.getUserEntity());
    }




}
