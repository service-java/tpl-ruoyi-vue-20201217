package com.ruoyi.qrtz.controller;

import java.util.List;

import com.ruoyi.qrtz.service.ISysJobLogService;
import io.swagger.annotations.Api;
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
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.qrtz.domain.SysJobLog;

/**
 * 调度日志操作处理
 *
 * @author ruoyi
 */
@Api(tags="调度日志操作处理")
@RestController
@RequestMapping("/monitor/jobLog")
public class SysJobLogController extends BaseController {
    @Autowired
    private ISysJobLogService jobLogService;

    /**
     * 查询定时任务调度日志列表
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:list')")
    @GetMapping("/list")
    public TableDataVo list(SysJobLog sysJobLog) {
        startPage();
        List<SysJobLog> list = jobLogService.selectJobLogList(sysJobLog);
        return getDataTable(list);
    }

    /**
     * 导出定时任务调度日志列表
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:export')")
    @Log(title = "任务调度日志", businessType = BusinessTypeEnum.EXPORT)
    @GetMapping("/export")
    public ResultVo export(SysJobLog sysJobLog) {
        List<SysJobLog> list = jobLogService.selectJobLogList(sysJobLog);
        ExcelUtils<SysJobLog> util = new ExcelUtils<SysJobLog>(SysJobLog.class);
        return util.exportExcel(list, "调度日志");
    }

    /**
     * 根据调度编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:query')")
    @GetMapping(value = "/{configId}")
    public ResultVo getInfo(@PathVariable Long jobLogId) {
        return ResultVo.success(jobLogService.selectJobLogById(jobLogId));
    }


    /**
     * 删除定时任务调度日志
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:remove')")
    @Log(title = "定时任务调度日志", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{jobLogIds}")
    public ResultVo remove(@PathVariable Long[] jobLogIds) {
        return responseByRows(jobLogService.deleteJobLogByIds(jobLogIds));
    }

    /**
     * 清空定时任务调度日志
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:remove')")
    @Log(title = "调度日志", businessType = BusinessTypeEnum.CLEAN)
    @DeleteMapping("/clean")
    public ResultVo clean() {
        jobLogService.cleanJobLog();
        return ResultVo.success();
    }
}
