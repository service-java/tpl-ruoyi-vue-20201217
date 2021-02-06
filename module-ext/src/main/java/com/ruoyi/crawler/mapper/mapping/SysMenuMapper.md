selectMenuList
===

```sql
select * 
from sys_menu 
where 1=1
@if(!isBlank(menuName)){
    and  menu_name like #'%'+menuName+'%'#
@}
@if(!isBlank(visible)){
    and  visible like #visible#
@}
```



selectMenuListByUserId
===

```sql
select 
    distinct m.menu_id, m.parent_id, m.menu_name, 
    m.visible, (m.perms) as perms, 
    m.menu_type, m.icon, 
    m.order_num, m.create_time 
from sys_menu m
left join sys_role_menu rm on m.menu_id = rm.menu_id
left join sys_user_role ur on rm.role_id = ur.role_id
LEFT JOIN sys_role ro on ur.role_id = ro.role_id
where 1 = 1
@if (!isEmpty(params.userId)) {
    and ur.user_id = #params.userId#
@}
@if(!isBlank(menuName)){
    and  menu_name like #'%'+menuName+'%'#
@}
@if(!isBlank(visible)){
    and  visible like #visible#
@}
order by m.parent_id, m.order_num
```

