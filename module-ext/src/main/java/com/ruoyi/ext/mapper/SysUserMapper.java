package com.ruoyi.ext.mapper;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.ruoyi.ext.database.SqlParam;
import com.ruoyi.common.util.spring.SpringUtils;

import com.ruoyi.ext.util.SpringContextUtils;

import com.ruoyi.ext.domain.SysDept;
import com.ruoyi.ext.domain.SysRole;
import com.ruoyi.ext.domain.SysUser;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.engine.PageQuery;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * 用户表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysUserMapper")
public interface SysUserMapper extends BaseMapper<SysUser> {


    public default PageQuery<SysUser> createPageQuery(Object obj, int pageNumber, int pageSize) {
        PageQuery<SysUser> page = new PageQuery<>();
        page.setPageSize(pageSize);
        page.setPageNumber(pageNumber);
        //page.setTotalRow(Integer.MAX_VALUE);
        page.setParas(obj);

        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String end = (String) request.getParameter("params[endTime]");
        page.setPara("endTime", StrUtil.isBlank(end) ? null : new Date(DateUtil.parseDate(end).getTime()));

        String begin = (String) request.getParameter("params[beginTime]");
        page.setPara("beginTime", StrUtil.isBlank(begin) ? null : new Date(DateUtil.parseDate(begin).getTime()));

        String deptid = (String) request.getParameter("deptId");
        page.setPara("fakeId", StrUtil.isBlank(deptid) ? null : SpringContextUtils.getBean(SysDeptMapper.class).selectDeptById(Long.parseLong(deptid)).getFakeId());
        return page;
    }

    public PageQuery<SysUser> queryByCondition(PageQuery<SysUser> sysUser);

    /**
     * 根据条件分页查询用户列表
     *
     * @param sysUser 用户信息
     * @return 用户信息集合信息
     */

    public List<SysUser> selectUserList(SysUser sysUser);

//    public default List<SysUser> selectUserList(SysUser sysUser){
//        return queryByCondition(createPageQuery(sysUser , 1 , Integer.MAX_VALUE)).getList();
//    }


    public PageQuery<SysUser> queryAllocatedByCondition(PageQuery<SysUser> pageQuery);

    /**
     * 根据条件分页查询未已配用户角色列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public default List<SysUser> selectAllocatedList(SysUser user) {
        PageQuery<SysUser> page = new PageQuery<>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(user);
        return queryAllocatedByCondition(page).getList();
    }

    /**
     * 根据条件分页查询未分配用户角色列表
     *
     * @return 用户信息集合信息
     */
    public PageQuery<SysUser> queryUnallocatedByCondition(PageQuery<SysUser> pageQuery);

    public default List<SysUser> selectUnallocatedList(SysUser user) {
        PageQuery<SysUser> page = new PageQuery<>();
        page.setPageSize(Integer.MAX_VALUE);
        page.setPageNumber(1);
        page.setParas(user);
        return queryUnallocatedByCondition(page).getList();
    }

    /**
     * 通过用户名查询用户
     *
     * @return 用户对象信息
     */

    public default SysUser selectUserByLoginName(String loginName) {
        SysUser entify = new SysUser();
        entify.setLoginName(loginName);
        return selectUserBy(entify);
    }

    public default SysUser selectUserBy(SysUser entify) {
        SysUser sysUser = this.templateOne(entify);
        if (sysUser != null) {
            SysDeptMapper deptMapper = SpringUtils.getBean(SysDeptMapper.class);
            SysDept dept = deptMapper.single(sysUser.getDeptId());
            sysUser.set("sysDept", dept);
            List<SysRole> roles = this.getSQLManager().execute("select t1.* from " + SysRole.TABLENAME + " t1 left join sys_user_role t2 on t1.role_id= t2.role_id where t2.user_id = #userid#",
                    SysRole.class, SqlParam.create().set("userid", sysUser.getUserId()));
            sysUser.setRoles(roles);
        }
        return sysUser;
    }

    /**
     * 通过手机号码查询用户
     *
     * @return 用户对象信息
     */
    public default SysUser selectUserByPhoneNumber(String phonenumber) {
        SysUser entify = new SysUser();
        entify.setPhonenumber(phonenumber);
        return selectUserBy(entify);
    }

    /**
     * 通过邮箱查询用户
     *
     * @param email 邮箱
     * @return 用户对象信息
     */
    public default SysUser selectUserByEmail(String email) {
        SysUser entify = new SysUser();
        entify.setEmail(email);
        return selectUserBy(entify);
    }

    /**
     * 通过用户ID查询用户
     *
     * @param userId 用户ID
     * @return 用户对象信息
     */
    public default SysUser selectUserById(Long userId) {
        SysUser entify = new SysUser();
        entify.setUserId(userId);
        return selectUserBy(entify);
    }

    /**
     * 通过用户ID删除用户
     *
     * @param userId 用户ID
     * @return 结果
     */
    public default int deleteUserById(Long userId) {
        return this.deleteById(userId);
    }

    /**
     * 批量删除用户信息
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteUserByIds(Long[] ids);

    /**
     * 修改用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public default int updateUser(SysUser user) {
        return this.updateTemplateById(user);
    }

    ;

    /**
     * 新增用户信息
     *
     * @param user 用户信息
     * @return 结果
     */
    public default int insertUser(SysUser user) {
        user.setCreateTime(new Date());
        this.insertTemplate(user, true);
        return 1;
    }

    ;

    /**
     * 校验用户名称是否唯一
     *
     * @param loginName 登录名称
     * @return 结果
     */
    @Sql("select count(1) from sys_user where login_name=?")
    public int checkLoginNameUnique(String loginName);

    /**
     * 校验手机号码是否唯一
     *
     * @param phonenumber 手机号码
     * @return 结果
     */
    @Sql("select * from sys_user where phonenumber=?")
    public SysUser checkPhoneUnique(String phonenumber);

    /**
     * 校验email是否唯一
     *
     * @param email 用户邮箱
     * @return 结果
     */
    @Sql("select * from sys_user where email=?")
    public SysUser checkEmailUnique(String email);

}
