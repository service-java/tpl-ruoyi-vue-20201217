package com.ruoyi.sys.controller;

import java.util.List;
import java.util.stream.Collectors;

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
import org.springframework.web.multipart.MultipartFile;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.sys.controller.BaseController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.common.domain.sys.SysRole;
import com.ruoyi.common.domain.sys.SysUser;
import com.ruoyi.sys.security.login.LoginUser;
import com.ruoyi.common.vo.TableDataVo;
import com.ruoyi.common.enums.BusinessTypeEnum;
import com.ruoyi.sys.security.SecurityUtils;
import com.ruoyi.common.util.ServletUtils;
import com.ruoyi.common.util.StringUtils;
import com.ruoyi.common.util.poi.ExcelUtils;
import com.ruoyi.sys.security.TokenService;
import com.ruoyi.sys.service.ISysPostService;


/**
 * 用户信息
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    @Autowired
    private ISysUserService userService;

    @Autowired
    private ISysRoleService roleService;

    @Autowired
    private ISysPostService postService;

    @Autowired
    private TokenService tokenService;

    /**
     * 获取用户列表
     */
    @PreAuthorize("@ss.hasPermission('system:user:list')")
    @GetMapping("/list")
    public TableDataVo list(SysUser user) {
        startPage();
        List<SysUser> list = userService.selectUserList(user);
        return getDataTable(list);
    }

    @Log(title = "用户管理", businessType = BusinessTypeEnum.EXPORT)
    @PreAuthorize("@ss.hasPermission('system:user:export')")
    @GetMapping("/export")
    public ResultVo export(SysUser user) {
        List<SysUser> list = userService.selectUserList(user);
        ExcelUtils<SysUser> util = new ExcelUtils<SysUser>(SysUser.class);
        return util.exportExcel(list, "用户数据");
    }

    @Log(title = "用户管理", businessType = BusinessTypeEnum.IMPORT)
    @PreAuthorize("@ss.hasPermission('system:user:import')")
    @PostMapping("/importData")
    public ResultVo importData(MultipartFile file, boolean updateSupport) throws Exception {
        ExcelUtils<SysUser> util = new ExcelUtils<SysUser>(SysUser.class);
        List<SysUser> userList = util.importExcel(file.getInputStream());
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        String operName = loginUser.getUsername();
        String message = userService.importUser(userList, updateSupport, operName);
        return ResultVo.success(message);
    }

    @GetMapping("/importTemplate")
    public ResultVo importTemplate() {
        ExcelUtils<SysUser> util = new ExcelUtils<SysUser>(SysUser.class);
        return util.importTemplateExcel("用户数据");
    }

    /**
     * 根据用户编号获取详细信息
     */
    @PreAuthorize("@ss.hasPermission('system:user:query')")
    @GetMapping(value = {"/", "/{userId}"})
    public ResultVo getInfo(@PathVariable(value = "userId", required = false) Long userId) {
        ResultVo ajax = ResultVo.success();
        List<SysRole> roles = roleService.selectRoleAll();
        ajax.put("roles", SysUser.isAdmin(userId) ? roles : roles.stream().filter(r -> !r.isAdmin()).collect(Collectors.toList()));
        ajax.put("posts", postService.selectPostAll());
        if (StringUtils.isNotNull(userId)) {
            ajax.put(ResultVo.DATA_TAG, userService.selectUserById(userId));
            ajax.put("postIds", postService.selectPostListByUserId(userId));
            ajax.put("roleIds", roleService.selectRoleListByUserId(userId));
        }
        return ajax;
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermission('system:user:add')")
    @Log(title = "用户管理", businessType = BusinessTypeEnum.INSERT)
    @PostMapping
    public ResultVo add(@Validated @RequestBody SysUser user) {
        if (UserConstants.NOT_UNIQUE.equals(userService.checkUserNameUnique(user.getUserName()))) {
            return ResultVo.error("新增用户'" + user.getUserName() + "'失败，登录账号已存在");
        } else if (StringUtils.isNotEmpty(user.getPhonenumber())
                && UserConstants.NOT_UNIQUE.equals(userService.checkPhoneUnique(user))) {
            return ResultVo.error("新增用户'" + user.getUserName() + "'失败，手机号码已存在");
        } else if (StringUtils.isNotEmpty(user.getEmail())
                && UserConstants.NOT_UNIQUE.equals(userService.checkEmailUnique(user))) {
            return ResultVo.error("新增用户'" + user.getUserName() + "'失败，邮箱账号已存在");
        }
        user.setCreateBy(SecurityUtils.getUsername());
        user.setPassword(SecurityUtils.encryptPassword(user.getPassword()));
        return responseByRows(userService.insertUser(user));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermission('system:user:edit')")
    @Log(title = "用户管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping
    public ResultVo edit(@Validated @RequestBody SysUser user) {
        userService.checkUserAllowed(user);
        if (StringUtils.isNotEmpty(user.getPhonenumber())
                && UserConstants.NOT_UNIQUE.equals(userService.checkPhoneUnique(user))) {
            return ResultVo.error("修改用户'" + user.getUserName() + "'失败，手机号码已存在");
        } else if (StringUtils.isNotEmpty(user.getEmail())
                && UserConstants.NOT_UNIQUE.equals(userService.checkEmailUnique(user))) {
            return ResultVo.error("修改用户'" + user.getUserName() + "'失败，邮箱账号已存在");
        }
        user.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(userService.updateUser(user));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermission('system:user:remove')")
    @Log(title = "用户管理", businessType = BusinessTypeEnum.DELETE)
    @DeleteMapping("/{userIds}")
    public ResultVo remove(@PathVariable Long[] userIds) {
        return responseByRows(userService.deleteUserByIds(userIds));
    }

    /**
     * 重置密码
     */
    @PreAuthorize("@ss.hasPermission('system:user:resetPwd')")
    @Log(title = "用户管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/resetPwd")
    public ResultVo resetPwd(@RequestBody SysUser user) {
        userService.checkUserAllowed(user);
        user.setPassword(SecurityUtils.encryptPassword(user.getPassword()));
        user.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(userService.resetPwd(user));
    }

    /**
     * 状态修改
     */
    @PreAuthorize("@ss.hasPermission('system:user:edit')")
    @Log(title = "用户管理", businessType = BusinessTypeEnum.UPDATE)
    @PutMapping("/changeStatus")
    public ResultVo changeStatus(@RequestBody SysUser user) {
        userService.checkUserAllowed(user);
        user.setUpdateBy(SecurityUtils.getUsername());
        return responseByRows(userService.updateUserStatus(user));
    }
}
