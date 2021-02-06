package com.ruoyi.datav.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.datav.domain.DatavChart;
import com.ruoyi.datav.mapper.DatavChartMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 10:16
 */
@Api(tags="数据可视化模块")
@RestController
@RequestMapping("/datav")
@Slf4j
public class DatavController {

    @Autowired
    DatavChartMapper datavChartMapper;

    @Log(title = "列出Chart操作")
    @ApiOperation("listChart")
    @GetMapping("/listChart")
    public ResultVo listChart() {
        List<DatavChart> list = datavChartMapper.all();
        return ResultVo.success(list);
    }


    @ApiOperation("新增Chart")
    @PostMapping("/saveChart")
    public ResultVo saveChart(@RequestBody DatavChart datavChart) {
        ValidatorUtils.validateEntity(datavChart, AddGroup.class);

        datavChartMapper.insert(datavChart);
        return ResultVo.success();
    }

    @Log(title = "xmlDemo")
    @ApiOperation("xmlDemo")
    @GetMapping("/xmlDemo")
    public ResultVo demo() {
        List<DatavChart> list = datavChartMapper.queryDemo();
        return ResultVo.success(list);
    }
}
