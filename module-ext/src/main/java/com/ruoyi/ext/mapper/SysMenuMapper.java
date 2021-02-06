package com.ruoyi.ext.mapper;

import com.ruoyi.ext.domain.SysMenu;
import org.beetl.sql.core.annotatoin.Sql;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单表 数据层
 *
 * @author ruoyi
 */
@SqlResource("SysMenuMapper")
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 查询系统所有菜单（含按钮）
     *
     * @return 菜单列表
     */
    @Sql("select * from " + SysMenu.TABLENAME + " order by parent_id, order_num ")
    public List<SysMenu> selectMenuAll();

    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    @Sql("select distinct m.menu_id, m.parent_id, m.menu_name, m.url, m.visible, m.perms, m.target, m.menu_type, m.icon, m.order_num, m.create_time " +
            "		from sys_menu m " +
            "			 left join sys_role_menu rm on m.menu_id = rm.menu_id " +
            "			 left join sys_user_role ur on rm.role_id = ur.role_id " +
            "			 LEFT JOIN sys_role ro on ur.role_id = ro.role_id " +
            "		where ur.user_id = ? " +
            "		order by m.parent_id, m.order_num ")
    public List<SysMenu> selectMenuAllByUserId(Long userId);

    /**
     * 查询系统正常显示菜单（不含按钮）
     *
     * @return 菜单列表
     */
    @Sql("select distinct m.menu_id, m.parent_id, m.menu_name, m.url, m.visible, m.perms as perms, m.target, m.menu_type, m.icon, m.order_num, m.create_time" +
            "		from sys_menu m" +
            "		where m.menu_type in ('M', 'C') and m.visible = 0" +
            "		order by m.parent_id, m.order_num")
    public List<SysMenu> selectMenuNormalAll();

    /**
     * 根据用户ID查询菜单
     *
     * @param userId 用户ID
     * @return 菜单列表
     */
    @Sql("select distinct m.menu_id, m.parent_id, m.menu_name, m.url, m.visible, m.perms , m.target, m.menu_type, m.icon, m.order_num, m.create_time" +
            "		from sys_menu m" +
            "			 left join sys_role_menu rm on m.menu_id = rm.menu_id" +
            "			 left join sys_user_role ur on rm.role_id = ur.role_id" +
            "			 LEFT JOIN sys_role ro on ur.role_id = ro.role_id" +
            "		where ur.user_id = ? and m.menu_type in ('M', 'C') and m.visible = 0  AND ro.status = 0" +
            "		order by m.parent_id, m.order_num")
    public List<SysMenu> selectMenusByUserId(Long userId);

    /**
     * 根据用户ID查询权限
     *
     * @param userId 用户ID
     * @return 权限列表
     */
    @Sql("select distinct m.perms\r\n" +
            "		from sys_menu m\r\n" +
            "			 left join sys_role_menu rm on m.menu_id = rm.menu_id\r\n" +
            "			 left join sys_user_role ur on rm.role_id = ur.role_id\r\n" +
            "		where ur.user_id = ?")
    public List<String> selectPermsByUserId(Long userId);


    public default List<String> selectMenuTree(Long roleId) {
        List<SysMenu> menus = selectMenuTreeData(roleId);
        List<String> strings = new ArrayList<String>();
        for (SysMenu sysMenu : menus) {
            strings.add(sysMenu.getMenuId() + sysMenu.getPerms());
        }
        return strings;
    }

    /**
     * 根据角色ID查询菜单
     *
     * @param roleId 角色ID
     * @return 菜单列表
     */
    @Sql("select m.menu_id  , m.perms\r\n" +
            "		from sys_menu m\r\n" +
            "			left join sys_role_menu rm on m.menu_id = rm.menu_id\r\n" +
            "		where rm.role_id = ?\r\n" +
            "		order by m.parent_id, m.order_num")
    public List<SysMenu> selectMenuTreeData(Long roleId);

    /**
     * 查询系统菜单列表
     *
     * @param menu 菜单信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuList(SysMenu menu);

    /**
     * 查询系统菜单列表
     *
     * @param menu 菜单信息
     * @return 菜单列表
     */
    public List<SysMenu> selectMenuListByUserId(SysMenu menu);

    /**
     * 删除菜单管理信息
     *
     * @param menuId 菜单ID
     * @return 结果
     */
    public default int deleteMenuById(Long menuId) {
        SysMenu sysmenu = new SysMenu();
        sysmenu.setMenuId(menuId);
        sysmenu.setParentId(menuId);
        return this.getSQLManager().executeUpdate("delete from sys_menu where menu_id = #menuId# or parent_id = #parentId#", sysmenu);
    }

    /**
     * 根据菜单ID查询信息
     *
     * @param menuId 菜单ID
     * @return 菜单信息
     */
    public default SysMenu selectMenuById(Long menuId) {
        SysMenu sysmenu = new SysMenu();
        sysmenu.setMenuId(menuId);

        List<SysMenu> menus = this.getSQLManager().execute("SELECT t.menu_id, t.parent_id, t.menu_name, t.order_num, t.url, t.target, "
                + "	t.menu_type, t.visible, t.perms, t.icon, t.remark, "
                + "	(SELECT menu_name FROM sys_menu WHERE menu_id = t.parent_id) parent_name "
                + "	FROM sys_menu t where t.menu_id = #menuId#", SysMenu.class, sysmenu);
        if (menus.size() > 0) {
            return menus.get(0);
        }
        return null;
    }

    /**
     * 查询菜单数量
     *
     * @param parentId 菜单父ID
     * @return 结果
     */
    public default int selectCountMenuByParentId(Long parentId) {
        SysMenu sysmenu = new SysMenu();
        sysmenu.setParentId(parentId);
        Long count = this.templateCount(sysmenu);
        return count.intValue();
    }

    /**
     * 新增菜单信息
     *
     * @param menu 菜单信息
     * @return 结果
     */
    public default int insertMenu(SysMenu menu) {
        this.insertTemplate(menu, true);
        return 1;
    }

    /**
     * 修改菜单信息
     *
     * @param menu 菜单信息
     * @return 结果
     */
    public default int updateMenu(SysMenu menu) {
        return this.updateById(menu);
    }

    /**
     * 校验菜单名称是否唯一
     *
     * @param menuName 菜单名称
     * @param parentId 父菜单ID
     * @return 结果
     */
    public default SysMenu checkMenuNameUnique(String menuName, Long parentId) {
        SysMenu sysmenu = new SysMenu();
        sysmenu.setParentId(parentId);
        sysmenu.setMenuName(menuName);
        return this.templateOne(sysmenu);
    }


}
