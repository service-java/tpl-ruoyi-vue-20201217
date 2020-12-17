package com.ruoyi.oss.service;



import com.ruoyi.oss.domain.OssUser;

import java.util.Set;

/**
 * shiro相关接口
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface IShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    /**
     * 根据用户ID，查询用户
     *
     * @param userId
     */
    OssUser queryUser(Long userId);
}
