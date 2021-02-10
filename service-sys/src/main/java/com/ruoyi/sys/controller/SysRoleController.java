package com.ruoyi.sys.controller;

import java.util.List;

import com.ruoyi.sys.service.ISysRoleService;
import com.ruoyi.sys.service.ISysUserService;
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
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.domain.sys.SysRole;
import com.ruoyi.sys.security.login.LoginUser;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.sys.security.SecurityUtils;
import com.ruoyi.common.util.ServletUtils;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.security.SysPermissionService;
import com.ruoyi.sys.security.TokenService;


/**
 * 角色信息
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/role")
public class SysRoleController extends BaseController {
    @Autowired
    private ISysRoleService roleService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private SysPermissionService permissionService;

    @Autowired
    private ISysUserService userService;

    @PreAuthorize("@ss.hasPermission('system:role:list')")
    @GetMapping("/list")
    public TableDataVo list(SysRole role) {
        startPage();
        List<SysRole> list = roleService.selectRoleList(role);
        return getDataTable(list);
    }

    @Log(title = "角色管理", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('system:role:export')")
    @GetMapping("/export")
    public ResultVo export(SysRole role) {
        List<SysRole> list = roleService.selectRoleList(role);
        ExcelUtils<SysRole> util = new ExcelUtils<SysRole>(SysRole.class);
        return util.exportExcel(list, "角色数据");
    }

    /**
     * 根据角色编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermission('system:role:query')")
    @GetMapping(value = "/{roleId}")
    public ResultVo getInfo(@PathVariable Long roleId) {
        return ResultVo.success(roleService.selectRoleById(roleId));
    }

    /**
     * 新增角色
     */
    @PreAuthorize("@ss.hasPermission('system:role:add')")
    @Log(title = "角色管理", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    public ResultVo add(@Validated @RequestBody SysRole role) {
        if (UserConstants.NOT_UNIQUE.equals(roleService.checkRoleNameUnique(role))) {
            return ResultVo.error("新增角色'" + role.getRoleName() + "'失败，角色名称已存在");
        } else if (UserConstants.NOT_UNIQUE.equals(roleService.checkRoleKeyUnique(role))) {
            return ResultVo.error("新增角色'" + role.getRoleName() + "'失败，角色权限已存在");
        }
        role.setCreateBy(SecurityUtils.getUsername());
        return responseByRows(roleService.insertRole(role));

    }

    /**
     * 修改保存角色
     */
    @PreAuthorize("@ss.hasPermission('system:role:edit')")
    @Log(title = "角色管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@Validated @RequestBody SysRole role) {
        roleService.checkRoleAllowed(role);
        if (UserConstants.NOT_UNIQUE.equals(roleService.checkRoleNameUnique(role))) {
            return ResultVo.error("修改角色'" + role.getRoleName() + "'失败，角色名称已存在");
        } else if (UserConstants.NOT_UNIQUE.equals(roleService.checkRoleKeyUnique(role))) {
            return ResultVo.error("修改角色'" + role.getRoleName() + "'失败，角色权限已存在");
        }
        role.setUpdateBy(SecurityUtils.getUsername());

        if (roleService.updateRole(role) > 0) {
            // 更新缓存用户权限
            LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
            if (StringUtils.isNotNull(loginUser.getUser()) && !loginUser.getUser().isAdmin()) {
                loginUser.setPermissions(permissionService.getMenuPermission(loginUser.getUser()));
                loginUser.setUser(userService.selectUserByUserName(loginUser.getUser().getUserName()));
                tokenService.setLoginUser(loginUser);
            }
            return ResultVo.success();
        }
        return ResultVo.error("修改角色'" + role.getRoleName() + "'失败，请联系管理员");
    }

    /**
     * 修改保存数据权限
     */
    @PreAuthorize("@ss.hasPermission('system:role:edit')")
    @Log(title = "角色管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/dataScope")
    public ResultVo dataScope(@RequestBody SysRole role) {
        roleService.checkRoleAllowed(role);
        return responseByRows(roleService.authDataScope(role));
    }

    /**
     * 状态修改
     */
    @PreAuthorize("@ss.hasPermission('system:role:edit')")
    @Log(title = "角色管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/changeStatus")
    public ResultVo changeStatus(@RequestBody SysRole role) {
        roleService.checkRoleAllowed(role);
        role.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(roleService.updateRoleStatus(role));
    }

    /**
     * 删除角色
     */
    @PreAuthorize("@ss.hasPermission('system:role:remove')")
    @Log(title = "角色管理", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{roleIds}")
    public ResultVo remove(@PathVariable Long[] roleIds) {
        return responseByRows(roleService.deleteRoleByIds(roleIds));
    }

    /**
     * 获取角色选择框列表
     */
    @PreAuthorize("@ss.hasPermission('system:role:query')")
    @GetMapping("/optionselect")
    public ResultVo optionselect() {
        return ResultVo.success(roleService.selectRoleAll());
    }
}
