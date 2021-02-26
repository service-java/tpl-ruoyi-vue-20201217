/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.blog.controller;

import cn.hutool.crypto.digest.BCrypt;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.google.gson.Gson;
import com.ruoyi.common.query.PageQuery;
import com.ruoyi.common.exception.CustomException;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.cms.annotation.AliyunGroup;
import com.ruoyi.cms.annotation.QcloudGroup;
import com.ruoyi.cms.annotation.QiniuGroup;
import com.ruoyi.cms.cloud.CloudStorageConfig;
import com.ruoyi.cms.cloud.OSSFactory;
import com.ruoyi.cms.constant.OssConstant;
import com.ruoyi.cms.constant.StorageConstant;
import com.ruoyi.cms.domain.OssBucket;
import com.ruoyi.cms.domain.OssUser;
import com.ruoyi.cms.mapper.OssBucketMapper;
import com.ruoyi.cms.mapper.OssUserMapper;
import com.ruoyi.cms.service.OssBucketService;
import com.ruoyi.cms.service.OssConfigService;
import com.ruoyi.cms.shiro.TokenService;
import com.ruoyi.cms.shiro.ShiroUtils;
import com.ruoyi.cms.util.PageQueryUtils;
import com.ruoyi.cms.vo.PageDataVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Api(tags="OSS模块")
@RestController
@RequestMapping("/api/oss")
@Slf4j
public class OssController {
    @Autowired
    OssBucketMapper ossBucketMapper;

    @Autowired
    OssUserMapper ossUserMapper;

    @Autowired
    private OssBucketService ossBucketService;

    @Autowired
    private OssConfigService ossConfigService;

    private final static String KEY = StorageConstant.CLOUD_STORAGE_CONFIG_KEY;

    @Autowired
    private TokenService tokenService;

    @Value("${oss.salt}")
    private String salt;

    @ApiOperation("用户登录")
    @PostMapping("/login")
    @ResponseBody
    public ResultVo login(@RequestBody OssUser ossUser) {
        //用户信息
        OssUser user = ossUserMapper.selectOne(new QueryWrapper<OssUser>().eq("username", ossUser.getUsername()));

        // 账号不存在、密码错误
        String hashpw = BCrypt.hashpw(ossUser.getPassword(), salt);

        log.info("{} {}==>", ossUser.getPassword(), hashpw);
        if (user == null || !user.getPassword().equals(hashpw)) {
            return ResultVo.error("账号或密码不正确");
        }

        // @fix 之前错误存成ossUser(--> user)
        String token = tokenService.createToken(user);
        return ResultVo.success().setData(token);
    }

    @ApiOperation("新建用户")
    @PostMapping("/save")
    @RequiresPermissions("PERMISSION_OSS")
    @ResponseBody
    public ResultVo save(@RequestBody OssUser user) {
        ValidatorUtils.validateEntity(user, AddGroup.class);

        String hashpw = BCrypt.hashpw(user.getPassword(), salt);
        log.info("{} 转为 {} ==>", user.getPassword(), hashpw);
        user.setPassword(hashpw);

        return ResultVo.responseByRows(ossUserMapper.insert(user));
    }

    @ApiOperation("新增再删除")
    @GetMapping("/listDemo")
    @ResponseBody
    @RequiresPermissions("PERMISSION_DONT_HAVE")
    public Object listDemo() {
        // 先插入一条再说
        OssBucket query = new OssBucket();
        query.setName("1987pic");
        ossBucketMapper.insert(query);

        // 这样总能查询到了吧
        LambdaQueryWrapper<OssBucket> lambdaQuery = new QueryWrapper<OssBucket>()
                // 这里的Right是修饰Like的, 类比query.lte()
                .lambda().likeRight(OssBucket::getName, "1987");
        List<OssBucket> list = ossBucketMapper.selectList(lambdaQuery);
        return list;
    }

    /**
     * 列表
     */
    @ApiOperation("list")
    @GetMapping("/list")
    @RequiresPermissions("PERMISSION_OSS")
    public ResultVo list() {
        List<OssBucket> list = ossBucketService.list();
        return ResultVo.success(list);
    }

    @ApiOperation("显示当前用户")
    @GetMapping("/showCurrentUser")
    public ResultVo showCurrentUser(HttpServletRequest request) {
        return ResultVo.success(tokenService.getLoginUser(request));
    }

    @ApiOperation("page")
    @GetMapping("/page")
    @ResponseBody
    public ResultVo page(PageQuery pageQuery, OssBucket ossBucket) {
        PageDataVo page = ossBucketService.page(pageQuery, ossBucket);
        return ResultVo.success(page);
    }

    @ApiOperation("pageByXml")
    @GetMapping("/pageByXml")
    @ResponseBody
    public ResultVo pageByXml(PageQuery pageQuery, OssBucket ossBucket) {
        log.info("{}\n {} ==> ", pageQuery, ossBucket);
        IPage<OssBucket> ossBucketIPage = ossBucketMapper.pageByXML(
                new PageQueryUtils<OssBucket>().convertIPage(pageQuery),
                ossBucket);
        return ResultVo.success(new PageDataVo(ossBucketIPage));
    }

    /**
     * 云存储配置信息
     */
    @ApiOperation("获取配置")
    @GetMapping("/config")
    @RequiresPermissions("PERMISSION_OSS")
    public ResultVo config() {
        CloudStorageConfig config = ossConfigService.getConfigObject(KEY, CloudStorageConfig.class);

        return ResultVo.success(config);
    }


    /**
     * 保存云存储配置信息
     */
    @ApiOperation("保存配置")
    @PostMapping("/saveConfig")
    @RequiresPermissions("PERMISSION_OSS")
    public ResultVo saveConfig(@RequestBody CloudStorageConfig config) {
        //校验类型
        ValidatorUtils.validateEntity(config);

        if (config.getType() == OssConstant.CloudService.QINIU.getValue()) {
            //校验七牛数据
            ValidatorUtils.validateEntity(config, QiniuGroup.class);
        } else if (config.getType() == OssConstant.CloudService.ALIYUN.getValue()) {
            //校验阿里云数据
            ValidatorUtils.validateEntity(config, AliyunGroup.class);
        } else if (config.getType() == OssConstant.CloudService.QCLOUD.getValue()) {
            //校验腾讯云数据
            ValidatorUtils.validateEntity(config, QcloudGroup.class);
        }

        ossConfigService.updateValueByKey(KEY, new Gson().toJson(config));

        return ResultVo.success();
    }


    /**
     * 上传文件
     */
    @ApiOperation("上传文件")
    @PostMapping("/upload")
    public ResultVo upload(@RequestParam("file") MultipartFile file) throws Exception {
        if (file.isEmpty()) {
            throw new CustomException("上传文件不能为空");
        }

        //上传文件
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String url = OSSFactory.build().uploadSuffix(file.getBytes(), suffix);

//        String fileName = FileUploadUtils.upload(CommonConfig.getUploadPath(), file);
//        String downloadPath = CommonConfig.getProfile() + StringUtils.substringAfter(fileName, Constants.RESOURCE_PREFIX);
//        String downloadName = StringUtils.substringAfterLast(downloadPath, "/");

        //保存文件信息
        OssBucket ossEntity = new OssBucket();
        ossEntity.setName(url);
        ossBucketService.save(ossEntity);

        return ResultVo.success()
                .setData(ossEntity.getName())
//                .set("fileName", downloadName)
//                .set("localPath", downloadPath)
                ;
    }


    /**
     * 删除
     */
    @ApiOperation("批量删除文件")
    @PostMapping("/delete")
    @RequiresPermissions("PERMISSION_OSS")
    public ResultVo delete(@RequestBody Long[] ids) {
        ossBucketService.removeByIds(Arrays.asList(ids));

        return ResultVo.success();
    }


    @ApiOperation("currentUser")
    @GetMapping("/currentUser")
    @ResponseBody
    public Object currentUser() {
        return ResultVo.success(ShiroUtils.getUserEntity());
    }


}
