package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysRoleDept;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;

/**
 * 角色与部门关联表 数据层
 *
 * @author ruoyi
 */
public interface SysRoleDeptMapper extends BaseMapper<SysRoleDept> {
    /**
     * 通过角色ID删除角色和部门关联
     *
     * @param roleId 角色ID
     * @return 结果
     */
    @Sql("delete from sys_role_dept where role_id=?")
    public int deleteRoleDeptByRoleId(Long roleId);

    /**
     * 批量删除角色部门关联信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */

    public default int deleteRoleDept(Long[] ids) {
        return this.getSQLManager().executeUpdate("delete from sys_role_dept where role_id in (#join(ids)#)", SqlParam.create().set("ids", ids));
    }

    /**
     * 查询部门使用数量
     *
     * @param deptId 部门ID
     * @return 结果
     */
    @Sql("select count(1) from sys_role_dept where dept_id=?")
    public int selectCountRoleDeptByDeptId(Long deptId);

    /**
     * 批量新增角色部门信息
     *
     * @param roleDeptList 角色部门列表
     * @return 结果
     */

    public default int batchRoleDept(List<SysRoleDept> roleDeptList) {
        this.insertBatch(roleDeptList);
        return roleDeptList.size();
    }
}
