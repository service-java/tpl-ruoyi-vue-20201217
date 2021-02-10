package com.ruoyi.qrtz.controller;

import java.util.List;

import com.ruoyi.sys.security.SecurityUtils;
import com.ruoyi.qrtz.service.ISysJobService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.common.exception.job.TaskException;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.qrtz.domain.SysJob;
import com.ruoyi.qrtz.util.CronUtils;

/**
 * 调度任务信息操作处理
 *
 * @author ruoyi
 */
@Api(tags="调度任务")
@RestController
@RequestMapping("/monitor/job")
public class SysJobController extends BaseController {
    @Autowired
    private ISysJobService jobService;

    /**
     * 查询定时任务列表
     */
    @ApiOperation("查询定时任务列表")
    @PreAuthorize("@ss.hasPermission('monitor:job:list')")
    @GetMapping("/list")
    public TableDataVo list(SysJob sysJob) {
        startPage();
        List<SysJob> list = jobService.selectJobList(sysJob);
        return getDataTable(list);
    }

    /**
     * 导出定时任务列表
     */
    @ApiOperation("导出定时任务列表")
    @PreAuthorize("@ss.hasPermission('monitor:job:export')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.EXPORT)
    @GetMapping("/export")
    public ResultVo export(SysJob sysJob) {
        List<SysJob> list = jobService.selectJobList(sysJob);
        ExcelUtils<SysJob> util = new ExcelUtils<SysJob>(SysJob.class);
        return util.exportExcel(list, "定时任务");
    }

    /**
     * 获取定时任务详细信息
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:query')")
    @GetMapping(value = "/{jobId}")
    public ResultVo getInfo(@PathVariable("jobId") Long jobId) {
        return ResultVo.success(jobService.selectJobById(jobId));
    }

    /**
     * 新增定时任务
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:add')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    public ResultVo add(@RequestBody SysJob sysJob) throws SchedulerException, TaskException {
        if (!CronUtils.isValid(sysJob.getCronExpression())) {
            return ResultVo.error("cron表达式不正确");
        }
        sysJob.setCreateBy(SecurityUtils.getUsername());
        return responseByRows(jobService.insertJob(sysJob));
    }

    /**
     * 修改定时任务
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:edit')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@RequestBody SysJob sysJob) throws SchedulerException, TaskException {
        if (!CronUtils.isValid(sysJob.getCronExpression())) {
            return ResultVo.error("cron表达式不正确");
        }
        sysJob.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(jobService.updateJob(sysJob));
    }

    /**
     * 定时任务状态修改
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:changeStatus')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/changeStatus")
    public ResultVo changeStatus(@RequestBody SysJob job) throws SchedulerException {
        SysJob newJob = jobService.selectJobById(job.getJobId());
        newJob.setStatus(job.getStatus());
        return responseByRows(jobService.changeStatus(newJob));
    }

    /**
     * 定时任务立即执行一次
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:changeStatus')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/run")
    public ResultVo run(@RequestBody SysJob job) throws SchedulerException {
        jobService.run(job);
        return ResultVo.success();
    }

    /**
     * 删除定时任务
     */
    @PreAuthorize("@ss.hasPermission('monitor:job:remove')")
    @Log(title = "定时任务", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{jobIds}")
    public ResultVo remove(@PathVariable Long[] jobIds) throws SchedulerException, TaskException {
        jobService.deleteJobByIds(jobIds);
        return ResultVo.success();
    }
}
