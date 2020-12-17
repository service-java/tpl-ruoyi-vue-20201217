package com.ruoyi.datav.controller;

import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.datav.domain.DatavChart;
import com.ruoyi.datav.service.DatavChartService;
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
    private DatavChartService datavChartService;

    @Log(title = "列出Chart操作")
    @ApiOperation("listChart")
    @GetMapping("/listChart")
    public ResultVo listChart() {
        List<DatavChart> list = datavChartService.list();
        return ResultVo.success(list);
    }


    @ApiOperation("新增Chart")
    @PostMapping("/saveChart")
    public ResultVo saveChart(@RequestBody DatavChart datavChart) {
        ValidatorUtils.validateEntity(datavChart, AddGroup.class);

        return ResultVo.responseByBool(datavChartService.save(datavChart));
    }
}
