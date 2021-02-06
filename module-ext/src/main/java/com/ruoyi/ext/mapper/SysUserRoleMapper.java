package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysUserRole;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * 用户与角色关联表 数据层
 *
 * @author ruoyi
 */
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
    /**
     * 通过用户ID删除用户和角色关联
     *
     * @param userId 用户ID
     * @return 结果
     */
    @Sql("delete from sys_user_role where user_id=?")
    public int deleteUserRoleByUserId(Long userId);

    /**
     * 批量删除用户和角色关联
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public default int deleteUserRole(Long[] ids) {
        return this.executeUpdate("delete from sys_user_role where user_id in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 通过角色ID查询角色使用数量
     *
     * @param roleId 角色ID
     * @return 结果
     */
    @Sql("select count(1) from sys_user_role where role_id=? ")
    public int countUserRoleByRoleId(Long roleId);

    /**
     * 批量新增用户角色信息
     *
     * @param userRoleList 用户角色列表
     * @return 结果
     */
    public default int batchUserRole(List<SysUserRole> userRoleList) {
        this.insertBatch(userRoleList);
        return userRoleList.size();
    }

    /**
     * 删除用户和角色关联信息
     *
     * @param userRole 用户和角色关联信息
     * @return 结果
     */
    public default int deleteUserRoleInfo(SysUserRole userRole) {
        return this.getSQLManager().executeUpdate("delete from sys_user_role where "
                + "user_id=#userId# and role_id=#roleId#", userRole);
    }

    /**
     * 批量取消授权用户角色
     *
     * @param roleId  角色ID
     * @param userIds 需要删除的用户数据ID
     * @return 结果
     */
    public default int deleteUserRoleInfos(@Param("roleId") Long roleId, @Param("userIds") Long[] userIds) {
        return this.executeUpdate("delete from sys_user_role where "
                + "user_id=(#join(userIds)#) and role_id=#roleId", SqlParam.create().set("roleId", roleId).set("userIds", userIds));
    }
}
