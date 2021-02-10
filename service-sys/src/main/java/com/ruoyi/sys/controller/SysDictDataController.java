package com.ruoyi.sys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.domain.sys.SysDictData;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.sys.security.SecurityUtils;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.service.ISysDictDataService;
import com.ruoyi.sys.service.ISysDictTypeService;

/**
 * 数据字典信息
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/dict/data")
public class SysDictDataController extends BaseController {
    @Autowired
    private ISysDictDataService dictDataService;

    @Autowired
    private ISysDictTypeService dictTypeService;

    @PreAuthorize("@ss.hasPermission('system:dict:list')")
    @GetMapping("/list")
    public TableDataVo list(SysDictData dictData) {
        startPage();
        List<SysDictData> list = dictDataService.selectDictDataList(dictData);
        return getDataTable(list);
    }

    @Log(title = "字典数据", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('system:dict:export')")
    @GetMapping("/export")
    public ResultVo export(SysDictData dictData) {
        List<SysDictData> list = dictDataService.selectDictDataList(dictData);
        ExcelUtils<SysDictData> util = new ExcelUtils<SysDictData>(SysDictData.class);
        return util.exportExcel(list, "字典数据");
    }

    /**
     * 查询字典数据详细
     */
    @PreAuthorize("@ss.hasPermission('system:dict:query')")
    @GetMapping(value = "/{dictCode}")
    public ResultVo getInfo(@PathVariable Long dictCode) {
        return ResultVo.success(dictDataService.selectDictDataById(dictCode));
    }

    /**
     * 根据字典类型查询字典数据信息
     */
    @GetMapping(value = "/type/{dictType}")
    public ResultVo dictType(@PathVariable String dictType) {
        List<SysDictData> data = dictTypeService.selectDictDataByType(dictType);
        if (StringUtils.isNull(data)) {
            data = new ArrayList<SysDictData>();
        }
        return ResultVo.success(data);
    }

    /**
     * 新增字典类型
     */
    @PreAuthorize("@ss.hasPermission('system:dict:add')")
    @Log(title = "字典数据", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    public ResultVo add(@Validated @RequestBody SysDictData dict) {
        dict.setCreateBy(SecurityUtils.getUsername());
        return responseByRows(dictDataService.insertDictData(dict));
    }

    /**
     * 修改保存字典类型
     */
    @PreAuthorize("@ss.hasPermission('system:dict:edit')")
    @Log(title = "字典数据", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@Validated @RequestBody SysDictData dict) {
        dict.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(dictDataService.updateDictData(dict));
    }

    /**
     * 删除字典类型
     */
    @PreAuthorize("@ss.hasPermission('system:dict:remove')")
    @Log(title = "字典类型", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{dictCodes}")
    public ResultVo remove(@PathVariable Long[] dictCodes) {
        return responseByRows(dictDataService.deleteDictDataByIds(dictCodes));
    }
}
