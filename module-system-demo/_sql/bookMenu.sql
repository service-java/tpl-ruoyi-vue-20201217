-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书管理', '1', '1', 'book', 'system/book/index', 1, 0, 'C', '0', '0', 'system:book:list', '#', 'admin', sysdate(), '', null, '图书菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:book:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:book:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:book:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:book:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('图书导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:book:export',       '#', 'admin', sysdate(), '', null, '');
