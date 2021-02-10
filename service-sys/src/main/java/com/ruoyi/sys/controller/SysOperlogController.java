package com.ruoyi.sys.controller;

import java.util.List;

import com.ruoyi.common.domain.sys.SysOperLog;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.service.ISysOperLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;


/**
 * 操作日志记录
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/monitor/operlog")
public class SysOperlogController extends BaseController {
    @Autowired
    private ISysOperLogService operLogService;

    @PreAuthorize("@ss.hasPermission('monitor:operlog:list')")
    @GetMapping("/list")
    public TableDataVo list(SysOperLog operLog) {
        startPage();
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        return getDataTable(list);
    }

    @Log(title = "操作日志", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('monitor:operlog:export')")
    @GetMapping("/export")
    public ResultVo export(SysOperLog operLog) {
        List<SysOperLog> list = operLogService.selectOperLogList(operLog);
        ExcelUtils<SysOperLog> util = new ExcelUtils<SysOperLog>(SysOperLog.class);
        return util.exportExcel(list, "操作日志");
    }

    @PreAuthorize("@ss.hasPermission('monitor:operlog:remove')")
    @DeleteMapping("/{operIds}")
    public ResultVo remove(@PathVariable Long[] operIds) {
        return responseByRows(operLogService.deleteOperLogByIds(operIds));
    }

    @Log(title = "操作日志", businessType = BusinessTypeEnum.CLEAN)
    @PreAuthorize("@ss.hasPermission('monitor:operlog:remove')")
    @DeleteMapping("/clean")
    public ResultVo clean() {
        operLogService.cleanOperLog();
        return ResultVo.success();
    }
}
