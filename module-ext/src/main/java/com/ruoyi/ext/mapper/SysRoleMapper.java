package com.ruoyi.ext.mapper;

import com.ruoyi.ext.domain.SysRole;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.Date;
import java.util.List;

/**
 * 角色表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysRoleMapper")
public interface SysRoleMapper extends BaseMapper<SysRole> {


    public static final String SELECT_ROLE_CONTACTVO = "select distinct r.role_id, r.role_name, r.role_key, r.role_sort, r.data_scope,\r\n" +
            "            r.status, r.del_flag, r.create_time, r.remark \r\n" +
            "        from sys_role r\r\n" +
            "	        left join sys_user_role ur on ur.role_id = r.role_id\r\n" +
            "	        left join sys_user u on u.user_id = ur.user_id\r\n" +
            "	        left join sys_dept d on u.dept_id = d.dept_id";

    /**
     * 根据条件分页查询角色数据
     *
     * @param role 角色信息
     * @return 角色数据集合信息
     */
    public PageQuery<SysRole> queryByCondition(PageQuery<SysRole> pageQuery);

    public default List<SysRole> selectRoleList(SysRole role) {
        PageQuery<SysRole> page = new PageQuery<SysRole>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(role);
        return queryByCondition(page).getList();
    }

    /**
     * 根据用户ID查询角色
     *
     * @param userId 用户ID
     * @return 角色列表
     */
    @Sql(SELECT_ROLE_CONTACTVO + " WHERE r.del_flag = '0' and ur.user_id = ?")
    public List<SysRole> selectRolesByUserId(Long userId);

    /**
     * 通过角色ID查询角色
     *
     * @param roleId 角色ID
     * @return 角色对象信息
     */
    public default SysRole selectRoleById(Long roleId) {
        return this.single(roleId);
    }

    /**
     * 通过角色ID删除角色
     *
     * @param roleId 角色ID
     * @return 结果
     */
    public default int deleteRoleById(Long roleId) {
        return this.deleteById(roleId);
    }

    /**
     * 批量角色用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public default int deleteRoleByIds(Long[] ids) {
        return this.deleteRoleByIds(ids);
    }

    /**
     * 修改角色信息
     *
     * @param role 角色信息
     * @return 结果
     */
    public default int updateRole(SysRole role) {
        role.setUpdateTime(new Date());
        return this.updateTemplateById(role);
    }

    /**
     * 新增角色信息
     *
     * @param role 角色信息
     * @return 结果
     */
    public default int insertRole(SysRole role) {
        role.setCreateTime(new Date());
        this.insertTemplate(role, true);
        return 1;
    }

    /**
     * 校验角色名称是否唯一
     *
     * @param roleName 角色名称
     * @return 角色信息
     */
    @Sql("select * from sys_role where role_name=?")
    public SysRole checkRoleNameUnique(String roleName);

    /**
     * 校验角色权限是否唯一
     *
     * @param roleKey 角色权限
     * @return 角色信息
     */
    @Sql("select * from sys_role where role_key=?")
    public SysRole checkRoleKeyUnique(String roleKey);


}
