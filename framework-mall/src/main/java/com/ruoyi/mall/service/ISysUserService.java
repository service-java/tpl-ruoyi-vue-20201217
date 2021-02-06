package com.ruoyi.mall.service;

import com.ruoyi.common.domain.sys.SysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户 业务层
 *
 * @author ruoyi
 */
public interface ISysUserService {
    /**
     * 根据条件分页查询用户列表
     *
     * @param user 用户信息
     * @return 用户信息集合信息
     */
    public List<SysUser> selectUserList(SysUser user);

    /**
     * 通过用户名查询用户
     *
     * @param userName 用户名
     * @return 用户对象信息
     */
    public SysUser selectUserByUserName(String userName);


    SysUser selectUserById(Long userId);

    String selectUserRoleGroup(String userName);

    String selectUserPostGroup(String userName);

    String checkUserNameUnique(String userName);

    String checkPhoneUnique(SysUser user);

    String checkEmailUnique(SysUser user);

    void checkUserAllowed(SysUser user);

    @Transactional
    int insertUser(SysUser user);

    @Transactional
    int updateUser(SysUser user);

    int updateUserStatus(SysUser user);

    int updateUserProfile(SysUser user);

    boolean updateUserAvatar(String userName, String avatar);

    int resetPwd(SysUser user);

    int resetUserPwd(String userName, String password);

    @Transactional
    int deleteUserById(Long userId);

    @Transactional
    int deleteUserByIds(Long[] userIds);

    String importUser(List<SysUser> userList, Boolean isUpdateSupport, String operName);
}
