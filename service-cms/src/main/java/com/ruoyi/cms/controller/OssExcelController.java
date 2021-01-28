/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.ruoyi.cms.controller;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.cms.domain.OssUser;
import com.ruoyi.cms.listener.OssUserExcelListener;
import com.ruoyi.cms.mapper.OssUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Api(tags = "OSS-EXCEL模块")
@RestController
@RequestMapping("/api/ossExcel")
@Slf4j
public class OssExcelController {

    @Autowired
    OssUserMapper ossUserMapper;


    @ApiOperation("下载")
    @GetMapping("/download")
    public void download(HttpServletResponse response) throws IOException {
        response.setContentType("application/vnd.ms-excel");
//        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        response.setCharacterEncoding("utf-8");

        List<OssUser> ossUsers = ossUserMapper.selectList(new QueryWrapper<>());
        log.info("当前用户列表 {}", ossUsers);

        String fileName = URLEncoder.encode("测试", "UTF-8");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
        EasyExcel.write(response.getOutputStream(), OssUser.class).sheet("模板").doWrite(ossUsers);
    }

    @ApiOperation("上传")
    @PostMapping("/upload")
    @ResponseBody
    public ResultVo upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), OssUser.class, new OssUserExcelListener()).sheet().doRead();
        return ResultVo.success();
    }

}
