package com.ruoyi.ext.mapper;


import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.ext.domain.SysDept;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.kit.StringKit;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 部门管理 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysDeptMapper")
public interface SysDeptMapper extends BaseMapper<SysDept> {
    /**
     * 查询部门人数
     *
     * @param dept 部门信息
     * @return 结果
     */
    public int selectDeptCount(SysDept dept);

    /**
     * 查询部门是否存在用户
     *
     * @param deptId 部门ID
     * @return 结果
     */
    @Sql("select count(1) from sys_user where dept_id = ? and del_flag = '0'")
    public int checkDeptExistUser(Long deptId);

    /**
     * 查询部门管理数据
     *
     * @param dept 部门信息
     * @return 部门信息集合
     */
    public List<SysDept> selectDeptList(SysDept dept);

    /**
     * 删除部门管理信息
     *
     * @param deptId 部门ID
     * @return 结果
     */
    public default int deleteDeptById(Long deptId) {
        return this.deleteById(deptId);
    }

    ;

    /**
     * 新增部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public default int insertDept(SysDept dept) {
        dept.setCreateTime(new Date());
        this.insertTemplate(dept, true);
        dept.setFakeId((dept.getAncestors() + ',' + dept.getDeptId()).substring(2) + ',');
        this.updateTemplateById(dept);
        return 1;
    }

    /**
     * 修改部门信息
     *
     * @param dept 部门信息
     * @return 结果
     */
    public default int updateDept(SysDept dept) {
        dept.setUpdateTime(new Date());
        dept.setFakeId((dept.getAncestors() + ',' + dept.getDeptId()).substring(2) + ',');
        return this.updateTemplateById(dept);
    }

    /**
     * 修改子元素关系
     *
     * @param depts 子元素
     * @return 结果
     */
    public default int updateDeptChildren(List<SysDept> depts) {
        int ret = 0;
        for (SysDept sysDept : depts) {
            sysDept.setFakeId((sysDept.getAncestors() + ',' + sysDept.getDeptId()).substring(2) + ',');
            ret += this.getSQLManager().executeUpdate("update sys_dept set ancestors = #ancestors# , fake_id = #fakeId# where dept_id = #deptId#", sysDept);
        }
        return ret;

    }

    /**
     * 根据部门ID查询信息
     *
     * @param deptId 部门ID
     * @return 部门信息
     */
    @Sql("select d.dept_id, d.parent_id, d.ancestors, d.dept_name, d.order_num, d.leader, d.phone, d.email, d.status ,d.fake_id, " +
            "			(select dept_name from sys_dept where dept_id = d.parent_id) parent_name " +
            "		from sys_dept d " +
            "		where d.dept_id = ?")
    public SysDept selectDeptById(Long deptId);

    /**
     * 校验部门名称是否唯一
     *
     * @param deptName 部门名称
     * @param parentId 父部门ID
     * @return 结果
     */
    @Sql("select * from sys_dept where dept_name=? and parent_id = ?")
    public SysDept checkDeptNameUnique(String deptName, Long parentId);

    /**
     * 根据角色ID查询部门
     *
     * @param roleId 角色ID
     * @return 部门列表
     */
    @Sql("select concat(d.dept_id, d.dept_name) as dept_name " +
            "		from sys_dept d " +
            "			left join sys_role_dept rd on d.dept_id = rd.dept_id " +
            "		where d.del_flag = '0' and rd.role_id = ? " +
            "		order by d.parent_id, d.order_num")
    public List<String> selectRoleDeptTree(Long roleId);

    /**
     * 修改所在部门的父级部门状态
     *
     * @param dept 部门
     */
    public default void updateDeptStatus(SysDept dept) {
        dept.setUpdateTime(new Date());
        String sql = "update sys_dept set ";
        if (StringKit.isNotBlank(dept.getStatus())) {
            sql += " status = #status# , ";
        }
        if (StringKit.isNotBlank(dept.getUpdateBy())) {
            sql += " update_by = #updateBy# ,";
        }
        sql += " update_time = #updatetime#  where dept_id = #deptId#";
        this.getSQLManager().executeUpdate(sql, SqlParam.create()
                .set("status", dept.getStatus())
                .set("updatetime", dept.getUpdateTime())
                .set("updateBy", dept.getUpdateBy()).set("deptId", dept.getDeptId()));
    }

    /**
     * 根据ID查询所有子部门
     *
     * @param deptId 部门ID
     * @return 部门列表
     */
    public default List<SysDept> selectChildrenDeptById(Long deptId) {
        SysDept sysDept = this.selectDeptById(deptId);
        return this.getSQLManager().execute("select * from sys_dept where fake_id like #fakeId+',%'#", SysDept.class, sysDept);
    }
}
