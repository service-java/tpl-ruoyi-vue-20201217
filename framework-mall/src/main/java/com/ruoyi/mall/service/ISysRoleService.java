package com.ruoyi.mall.service;

import com.ruoyi.common.domain.sys.SysRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * 角色业务层
 *
 * @author ruoyi
 */
public interface ISysRoleService {
    /**
     * 根据条件分页查询角色数据
     *
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    public List<SysRole> selectRoleList(SysRole role);

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectRolePermissionByUserId(Long userId);


    List<SysRole> selectRoleAll();

    List<Integer> selectRoleListByUserId(Long userId);

    SysRole selectRoleById(Long roleId);

    String checkRoleNameUnique(SysRole role);

    String checkRoleKeyUnique(SysRole role);

    void checkRoleAllowed(SysRole role);

    int countUserRoleByRoleId(Long roleId);

    @Transactional
    int insertRole(SysRole role);

    @Transactional
    int updateRole(SysRole role);

    int updateRoleStatus(SysRole role);

    @Transactional
    int authDataScope(SysRole role);

    @Transactional
    int deleteRoleById(Long roleId);

    @Transactional
    int deleteRoleByIds(Long[] roleIds);
}
