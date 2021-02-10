package com.ruoyi.sys.controller;

import java.util.List;

import com.ruoyi.common.domain.sys.SysLogininfor;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.service.ISysLogininforService;
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
 * 系统访问记录
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/monitor/logininfor")
public class SysLogininforController extends BaseController {
    @Autowired
    private ISysLogininforService logininforService;

    @PreAuthorize("@ss.hasPermission('monitor:logininfor:list')")
    @GetMapping("/list")
    public TableDataVo list(SysLogininfor logininfor) {
        // 开启分页
        startPage();
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        return getDataTable(list);
    }

    @Log(title = "登录日志", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('monitor:logininfor:export')")
    @GetMapping("/export")
    public ResultVo export(SysLogininfor logininfor) {
        List<SysLogininfor> list = logininforService.selectLogininforList(logininfor);
        ExcelUtils<SysLogininfor> util = new ExcelUtils<SysLogininfor>(SysLogininfor.class);
        return util.exportExcel(list, "登录日志");
    }

    @PreAuthorize("@ss.hasPermission('monitor:logininfor:remove')")
    @Log(title = "登录日志", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{infoIds}")
    public ResultVo remove(@PathVariable Long[] infoIds) {
        return responseByRows(logininforService.deleteLogininforByIds(infoIds));
    }

    @PreAuthorize("@ss.hasPermission('monitor:logininfor:remove')")
    @Log(title = "登录日志", businessType = BusinessTypeEnum.CLEAN)
    @DeleteMapping("/clean")
    public ResultVo clean() {
        logininforService.cleanLogininfor();
        return ResultVo.success();
    }
}
