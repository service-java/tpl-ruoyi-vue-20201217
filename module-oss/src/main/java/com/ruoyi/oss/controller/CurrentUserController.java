/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.oss.controller;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.gson.Gson;
import com.ruoyi.common.config.CommonConfig;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.dto.PageQuery;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.util.file.FileUploadUtils;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.oss.annotation.AliyunGroup;
import com.ruoyi.oss.annotation.QcloudGroup;
import com.ruoyi.oss.annotation.QiniuGroup;
import com.ruoyi.oss.cloud.CloudStorageConfig;
import com.ruoyi.oss.cloud.OSSFactory;
import com.ruoyi.oss.constant.OssConstant;
import com.ruoyi.oss.constant.StorageConstant;
import com.ruoyi.oss.domain.OssBucket;
import com.ruoyi.oss.domain.OssUser;
import com.ruoyi.oss.mapper.OssBucketMapper;
import com.ruoyi.oss.mapper.OssUserMapper;
import com.ruoyi.oss.service.OssBucketService;
import com.ruoyi.oss.service.OssConfigService;
import com.ruoyi.oss.service.TokenService;
import com.ruoyi.oss.shiro.ShiroUtils;
import com.ruoyi.oss.util.PageQueryUtils;
import com.ruoyi.oss.vo.PageDataVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Api(tags="公共模块")
@RestController
@RequestMapping("/api")
@Slf4j
public class CurrentUserController {


    @ApiOperation("currentUser")
    @GetMapping("/currentUser")
    @ResponseBody
    public Object currentUser() {
        return ResultVo.success(ShiroUtils.getUserEntity());
    }



}
