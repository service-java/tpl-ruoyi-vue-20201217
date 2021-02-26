package com.ruoyi.ext.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.ruoyi.common.properties.CommonProperties;
import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.file.FileUploadUtils;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.ext.domain.SysDept;
import com.ruoyi.ext.domain.SysDictData;
import com.ruoyi.ext.domain.SysMenu;
import com.ruoyi.ext.domain.SysUser;
import com.ruoyi.ext.mapper.SysDeptMapper;
import com.ruoyi.ext.mapper.SysDictDataMapper;
import com.ruoyi.ext.mapper.SysMenuMapper;
import com.ruoyi.ext.mapper.SysUserMapper;
import com.ruoyi.ext.feign.FeignService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.compress.utils.Lists;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@Api(tags = "BeetlSQL-Demo")
@Controller
@RequestMapping("/beetlsql")
@Slf4j
public class ExtController {

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SysDeptMapper sysDeptMapper;

    @Autowired
    SysDictDataMapper sysDictDataMapper;

    @Autowired
    SysMenuMapper sysMenuMapper;

    @Autowired
    FeignService feignService;

    @Value("${feign-url.oss}")
    private String ossUrl;


    @ApiOperation("demo")
    @GetMapping("/demo")
    @ResponseBody
    public Object demo() {
        SysUser sysUser = new SysUser();
//        sysUser.setUserName("admin");
        // 日期在sql里直接写就可以了
        sysUser.setCreateTime(DateUtil.parse("2020-01-12"));
//        sysUser.setDeptId(2L);
        List<SysUser> pageList = sysUserMapper.selectUserList(sysUser);
        return pageList;
    }

    @ApiOperation("countDept")
    @GetMapping("/countDept")
    @ResponseBody
    public Object coutDept() {
        ArrayList<Object> list = Lists.newArrayList();

//        List<SysDept> all = sysDeptMapper.all();
//        list.add(all);

        SysDept sysDept = new SysDept();
//        int count = sysDeptMapper.selectDeptCount(sysDept);
//        list.add(count);

        sysDept.setDeptName("运维");
        sysDept.setStatus("0");
        List<SysDept> sysDepts = sysDeptMapper.selectDeptList(sysDept);

        return sysDepts;
    }

    @ApiOperation("countDept")
    @GetMapping("/countDict")
    @ResponseBody
    public Object countDict() {
        PageQuery<SysDictData> pageQuery = new PageQuery<>();
        pageQuery.setPageSize(8);
        pageQuery.setPageNumber(1);
        PageQuery<SysDictData> pageQuery1 = sysDictDataMapper.queryByCondition(pageQuery);

        return pageQuery1;
    }

    @GetMapping("/listMenu")
    @ResponseBody
    public Object listMenu() {
        SysMenu sysMenu = new SysMenu();
        HashMap<String, Object> params = new HashMap<>();

        // ry管理员
//        params.put("userId", null); // 全部
        params.put("userId", 2); // 普通管理员
//        params.put("userId", 4); // 新增账号
        sysMenu.setParams(params);

        List<SysMenu> list = sysMenuMapper.selectMenuListByUserId(sysMenu);
        return list;
    }

    @GetMapping("/checkEmailUnique")
    @ResponseBody
    public Object email() {
        SysUser sysUser = sysUserMapper.checkEmailUnique("ry@163.com");
        return sysUser;
    }

    @ApiOperation("调用远程接口上传")
    @PostMapping("/remoteUploadByFeign")
    @ResponseBody
    public Object remoteUpload(@RequestParam("file") MultipartFile file) {
        log.info("文件为空： {}", file.isEmpty());

        // @fix 怎么在spring中使用 feign，解决上传文件的痛点
        // https://blog.csdn.net/sinat_27639721/article/details/81218357
        return feignService.upload(file);
    }

    @ApiOperation("调用远程接口上传")
    @PostMapping("/remoteUploadByHutool")
    @ResponseBody
    public Object remoteUploadByHutool(@RequestParam("file") MultipartFile file) throws IOException {
        log.info("文件为空： {}", file.isEmpty());
        HashMap<String, Object> paramMap = new HashMap<>();

        // 1) @todo MultipartFile直接转File估计是会报错的
        // org.springframework.web.multipart.commons.CommonsMultipartFile cannot be cast to java.io.File
        // paramMap.put("file", FileUtil.file((File) file));

        // 2) 先存储到本地再发送, 权当备份了
        // 文件上传只需将参数中的键指定（默认file），值设为文件对象即可
        // 对于使用者来说，文件上传与普通表单提交并无区别
        String fileName = FileUploadUtils.upload(CommonProperties.getUploadPath(), file);
        log.info("fileName {} :", fileName);
        String downloadPath = CommonProperties.getProfile() + StringUtils.substringAfter(fileName, Constants.RESOURCE_PREFIX);
        String downloadName = StringUtils.substringAfterLast(downloadPath, "/");
        log.info("downloadPath {} :", downloadPath);
        log.info("downloadName {} :", downloadName);
        paramMap.put("file", FileUtil.file(downloadPath));

        String result = HttpUtil.post(ossUrl + "/oss/upload", paramMap);
        log.info("result: {}", result);

        return JSON.parseObject(result ,ResultVo.class)
                .set("fileName", downloadName)
                .set("localPath", downloadPath);
    }

    /**
     * @todo 待实现
     * @param pageQuery
     * @return
     */
    @ApiOperation("调用远程接口分页")
    @GetMapping("/remotePageByFeign")
    @ResponseBody
    public Object remotePage(com.ruoyi.common.query.PageQuery pageQuery) {
//        return feignService.page(BeanUtil.beanToMap(pageQuery));
        return feignService.page(pageQuery.getPageNum(), pageQuery.getPageSize());
    }


    /**
     * @todo 待实现
     * @param pageQuery
     * @return
     */
    @ApiOperation("调用远程接口分页(hutool)")
    @GetMapping("/remotePageByHutool")
    @ResponseBody
    public Object remotePageByHutool(com.ruoyi.common.query.PageQuery pageQuery) {
        JSONObject paramMap = JSONUtil.parseObj(BeanUtil.beanToMap(pageQuery));

        String result = HttpRequest
                .get(ossUrl + "/oss/page")
                .header("Content-Type","application/json")
                .body(String.valueOf(paramMap))
                .execute()
                .body();

//        return JSONUtil.parseObj(result);
        return JSON.parse(result);
    }



}
