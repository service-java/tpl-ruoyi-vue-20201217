package com.ruoyi.sys.controller;

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
import com.ruoyi.common.annotation.RepeatSubmit;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.sys.security.SecurityUtils;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.domain.SysConfig;
import com.ruoyi.sys.service.ISysConfigService;

/**
 * 参数配置 信息操作处理
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/config")
public class SysConfigController extends BaseController {
    @Autowired
    private ISysConfigService configService;

    /**
     * 获取参数配置列表
     */
    @PreAuthorize("@ss.hasPermission('system:config:list')")
    @GetMapping("/list")
    public TableDataVo list(SysConfig config) {
        startPage();
        List<SysConfig> list = configService.selectConfigList(config);
        return getDataTable(list);
    }

    @Log(title = "参数管理", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('system:config:export')")
    @GetMapping("/export")
    public ResultVo export(SysConfig config) {
        List<SysConfig> list = configService.selectConfigList(config);
        ExcelUtils<SysConfig> util = new ExcelUtils<SysConfig>(SysConfig.class);
        return util.exportExcel(list, "参数数据");
    }

    /**
     * 根据参数编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermission('system:config:query')")
    @GetMapping(value = "/{configId}")
    public ResultVo getInfo(@PathVariable Long configId) {
        return ResultVo.success(configService.selectConfigById(configId));
    }

    /**
     * 根据参数键名查询参数值
     */
    @GetMapping(value = "/configKey/{configKey}")
    public ResultVo getConfigKey(@PathVariable String configKey) {
        return ResultVo.success(configService.selectConfigByKey(configKey));
    }

    /**
     * 新增参数配置
     */
    @PreAuthorize("@ss.hasPermission('system:config:add')")
    @Log(title = "参数管理", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    @RepeatSubmit
    public ResultVo add(@Validated @RequestBody SysConfig config) {
        if (UserConstants.NOT_UNIQUE.equals(configService.checkConfigKeyUnique(config))) {
            return ResultVo.error("新增参数'" + config.getConfigName() + "'失败，参数键名已存在");
        }
        config.setCreateBy(SecurityUtils.getUsername());
        return responseByRows(configService.insertConfig(config));
    }

    /**
     * 修改参数配置
     */
    @PreAuthorize("@ss.hasPermission('system:config:edit')")
    @Log(title = "参数管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@Validated @RequestBody SysConfig config) {
        if (UserConstants.NOT_UNIQUE.equals(configService.checkConfigKeyUnique(config))) {
            return ResultVo.error("修改参数'" + config.getConfigName() + "'失败，参数键名已存在");
        }
        config.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(configService.updateConfig(config));
    }

    /**
     * 删除参数配置
     */
    @PreAuthorize("@ss.hasPermission('system:config:remove')")
    @Log(title = "参数管理", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{configIds}")
    public ResultVo remove(@PathVariable Long[] configIds) {
        return responseByRows(configService.deleteConfigByIds(configIds));
    }

    /**
     * 清空缓存
     */
    @PreAuthorize("@ss.hasPermission('system:config:remove')")
    @Log(title = "参数管理", businessType = BusinessTypeEnum.CLEAN)
    @DeleteMapping("/clearCache")
    public ResultVo clearCache() {
        configService.clearCache();
        return ResultVo.success();
    }
}
