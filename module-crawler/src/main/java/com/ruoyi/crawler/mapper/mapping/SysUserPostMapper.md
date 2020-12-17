
queryByCondition
===

```sql
select 
@pageTag(){
    u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.password, u.sex, u.salt, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_by, 
    u.create_time, u.remark, d.dept_name, d.leader 
@}
from sys_user u 
left join sys_dept d on u.dept_id = d.dept_id 
where u.del_flag = '0'
@if(!isBlank(loginName)){
    and  u.login_name like #'%'+loginName+'%'#
@}
@if(!isBlank(status)){
    and  u.status = #status#
@}
@if(!isBlank(phonenumber)){
    and  u.phonenumber like #'%'+phonenumber+'%'#
@}
@if(!isBlank(beginTime)){
    and  u.beginTime <= #'%'+beginTime+'%'#
@}
@if(!isBlank(endTime)){
    and  u.endTime <= #'%'+endTime+'%'#
@}
@if(!isBlank(deptId)){
    AND u.dept_id like #deptId+'%'# 
@}
@pageIgnoreTag(){
    order by u.user_id desc
@}
@ orm.single({"deptId":"deptId"},"SysDept");
```

	


selectUserList
===

```sql
select 
    u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.password, u.sex, u.salt, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_by, u.create_time, 
    u.remark, d.dept_name, d.leader 
from sys_user u 
left join sys_dept d on u.dept_id = d.dept_id 
where u.del_flag = '0'
@if(!isBlank(loginName)){
    and  u.login_name like #'%'+loginName+'%'#
@}
@if(!isBlank(status)){
    and  u.status = #status#
@}
@if(!isBlank(phonenumber)){
    and  u.phonenumber like #'%'+phonenumber+'%'#
@}
@if(!isBlank(beginTime)){
    and  u.beginTime <= #'%'+beginTime+'%'#
@}
@if(!isBlank(endTime)){
    and  u.endTime <= #'%'+endTime+'%'#
@}
@if(!isBlank(deptId)){
    AND u.dept_id like #deptId+'%'# 
@}
```



selectAllocatedList
===

```sql
select 
    distinct u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.status, u.create_time
from sys_user u
left join sys_dept d on u.dept_id = d.dept_id
left join sys_user_role ur on u.user_id = ur.user_id
left join sys_role r on r.role_id = ur.role_id
where u.del_flag = '0' 
and r.role_id = #roleId#
@if(!isBlank(loginName)){
    AND u.login_name like #'%'+loginName+'%'# 
@}
@if(!isBlank(phonenumber)){
    AND u.phonenumber like #'%'+phonenumber+'%'# 
@}
```



selectUnallocatedList
===

```sql
select 
    distinct u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.status, u.create_time
from sys_user u
left join sys_dept d on u.dept_id = d.dept_id
left join sys_user_role ur on u.user_id = ur.user_id
left join sys_role r on r.role_id = ur.role_id
where u.del_flag = '0' 
and (r.role_id != #roleId# or r.role_id IS NULL)
and u.user_id not in (
    select u.user_id 
    from sys_user u 
    inner join sys_user_role ur on u.user_id = ur.user_id 
    and ur.role_id = #roleId#)
@if(!isBlank(loginName)){
AND u.login_name like #'%'+loginName+'%'# 
@}
@if(!isBlank(phonenumber)){
AND u.phonenumber like #'%'+phonenumber+'%'# 
@}
```


selectUserById
===

```sql
select  
    u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, 
    u.phonenumber, u.sex, u.password, 
    u.salt, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_time, 
    u.remark,
    d.dept_id, d.parent_id, d.dept_name, 
    d.order_num, d.leader, d.status as dept_status,
    r.role_id, r.role_name, r.role_key, r.role_sort, 
    r.data_scope, r.status as role_status
from sys_user u
left join sys_dept d on u.dept_id = d.dept_id
left join sys_user_role ur on u.user_id = ur.user_id
left join sys_role r on r.role_id = ur.role_id
where u.user_id = #userId#
@ orm.single({"deptId":"deptId"},"SysDept"); 
```
	

				 
