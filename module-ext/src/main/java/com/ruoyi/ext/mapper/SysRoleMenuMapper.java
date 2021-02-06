package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysRoleMenu;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * 角色与菜单关联表 数据层
 *
 * @author ruoyi
 */
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {
    /**
     * 通过角色ID删除角色和菜单关联
     *
     * @param roleId 角色ID
     * @return 结果
     */
    public default int deleteRoleMenuByRoleId(Long roleId) {
        return this.getSQLManager().executeUpdate("delete from sys_role_menu where role_id=#roleId#", SqlParam.create().set("roleId", roleId));
    }

    /**
     * 批量删除角色菜单关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public default int deleteRoleMenu(Long[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_role_menu where role_id in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 查询菜单使用数量
     *
     * @param menuId 菜单ID
     * @return 结果
     */
    public default int selectCountRoleMenuByMenuId(Long menuId) {
        SysRoleMenu sysRoleMenu = new SysRoleMenu();
        sysRoleMenu.setMenuId(menuId);
        Long count = this.templateCount(sysRoleMenu);
        return count.intValue();
    }

    /**
     * 批量新增角色菜单信息
     *
     * @param roleMenuList 角色菜单列表
     * @return 结果
     */
    public default int batchRoleMenu(List<SysRoleMenu> roleMenuList) {
        this.insertBatch(roleMenuList);
        return roleMenuList.size();
    }
}
