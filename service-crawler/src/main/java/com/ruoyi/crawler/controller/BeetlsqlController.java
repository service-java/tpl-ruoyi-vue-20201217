package com.ruoyi.crawler.controller;

import cn.hutool.core.date.DateUtil;
import com.ruoyi.crawler.domain.SysDept;
import com.ruoyi.crawler.domain.SysDictData;
import com.ruoyi.crawler.domain.SysMenu;
import com.ruoyi.crawler.domain.SysUser;
import com.ruoyi.crawler.mapper.SysDeptMapper;
import com.ruoyi.crawler.mapper.SysDictDataMapper;
import com.ruoyi.crawler.mapper.SysMenuMapper;
import com.ruoyi.crawler.mapper.SysUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.compress.utils.Lists;
import org.beetl.sql.core.engine.PageQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Api(tags = "BeetlSQL-Demo")
@Controller
@RequestMapping("/beetlsql")
public class BeetlsqlController {

    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    SysDeptMapper sysDeptMapper;

    @Autowired
    SysDictDataMapper sysDictDataMapper;

    @Autowired
    SysMenuMapper sysMenuMapper;


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


}
