package com.ruoyi.mall.service;

import com.ruoyi.common.domain.TreeSelectEntity;
import com.ruoyi.common.domain.sys.SysMenu;
import com.ruoyi.common.vo.RouterVo;

import java.util.List;
import java.util.Set;

/**
 * 菜单 业务层
 *
 * @author ruoyi
 */
public interface ISysMenuService {


    List<SysMenu> selectMenuList(Long userId);

    /**
     * 根据用户查询系统菜单列表
     *
     * @param menu   菜单信息
     * @param userId 用户ID
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu, Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    public Set<String> selectMenuPermsByUserId(Long userId);


    List<SysMenu> selectMenuTreeByUserId(Long userId);

    List<Integer> selectMenuListByRoleId(Long roleId);

    List<RouterVo> buildMenus(List<SysMenu> menus);

    List<SysMenu> buildMenuTree(List<SysMenu> menus);

    List<TreeSelectEntity> buildMenuTreeSelect(List<SysMenu> menus);

    SysMenu selectMenuById(Long menuId);

    boolean hasChildByMenuId(Long menuId);

    boolean checkMenuExistRole(Long menuId);

    int insertMenu(SysMenu menu);

    int updateMenu(SysMenu menu);

    int deleteMenuById(Long menuId);

    String checkMenuNameUnique(SysMenu menu);

    String getRouteName(SysMenu menu);

    String getRouterPath(SysMenu menu);

    String getComponent(SysMenu menu);
}
