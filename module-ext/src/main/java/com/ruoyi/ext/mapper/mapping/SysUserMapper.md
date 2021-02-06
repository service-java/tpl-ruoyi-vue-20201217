queryByCondition
===

```sql
select 
@pageTag(){
    u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.password, u.sex, u.salt, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_by, u.create_time, 
    u.remark, d.dept_name, d.leader 
@}
from sys_user u 
left join sys_dept d on u.dept_id = d.dept_id 
where u.del_flag = '0'
@if(!isEmptyObj(params)){
    #text(params.dataScope)# 
@}

@if(!isBlank(loginName)){
    and  u.login_name like #'%'+loginName+'%'#
@}
@if(!isBlank(status)){
    and  u.status = #status#
@}
@if(!isBlank(phonenumber)){
    and  u.phonenumber like #'%'+phonenumber+'%'#
@}
@if(has(beginTime) && beginTime != null){
   and  u.create_time>= #beginTime#
@}
@if(has(endTime) && endTime != null){
    and  u.create_time<= #endTime#
@}
@if(has(fakeId) && fakeId!=null){
   and d.fake_id like #fakeId+'%'# 
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
    u.user_id, u.dept_id, u.user_name, u.email, u.avatar, 
    u.phonenumber, u.password, u.sex, u.status, u.del_flag, 
    u.login_ip, u.login_date, u.create_by, u.create_time, 
    u.remark, 
    d.dept_name
from sys_user u 
left join sys_dept d on u.dept_id = d.dept_id 
where u.del_flag = '0'
@if(!isEmpty(createTime)){
    and  u.create_time <= DATE_FORMAT(#createTime#, '%Y-%m-%d')
@}
@if(!isEmpty(deptId)){
    AND u.dept_id = #deptId# 
@}
```


deleteUserByIds
===

```sql
update sys_user 
set del_flag = '2' 
where user_id in (#join(ids)#)
```

queryAllocatedByCondition
===

```sql
select 
@pageTag(){
    distinct u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.status, u.create_time
@}
from sys_user u
left join sys_dept d on u.dept_id = d.dept_id
left join sys_user_role ur on u.user_id = ur.user_id
left join sys_role r on r.role_id = ur.role_id
where u.del_flag = '0' and r.role_id = #roleId#

@if(!isEmptyObj(params)){
    #text(params.dataScope)# 
@}

@if(!isBlank(loginName)){
    AND u.login_name like #'%'+loginName+'%'# 
@}
@if(!isBlank(phonenumber)){
    AND u.phonenumber like #'%'+phonenumber+'%'# 
@}
@pageIgnoreTag(){
order by u.user_id desc
@}
```


queryUnallocatedByCondition
===

```sql
select 
@pageTag(){
    distinct u.user_id, u.dept_id, u.login_name, 
    u.user_name, u.email, u.avatar, u.phonenumber, 
    u.status, u.create_time
@}
from sys_user u
left join sys_dept d on u.dept_id = d.dept_id
left join sys_user_role ur on u.user_id = ur.user_id
left join sys_role r on r.role_id = ur.role_id
where u.del_flag = '0' and (r.role_id != #roleId# or r.role_id IS NULL)

@if(!isEmptyObj(params)){
    #text(params.dataScope)# 
@}

and u.user_id not in (
    select u.user_id 
    from sys_user u 
    inner join sys_user_role ur 
    on u.user_id = ur.user_id and ur.role_id = #roleId#)
@if(!isBlank(loginName)){
    AND u.login_name like #'%'+loginName+'%'# 
@}
@if(!isBlank(phonenumber)){
    AND u.phonenumber like #'%'+phonenumber+'%'# 
@}

@pageIgnoreTag(){
order by u.user_id desc
@}
```

		 			 
