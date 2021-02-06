queryByCondition
===

```sql
select 
@pageTag(){
    distinct r.role_id, r.role_name, r.role_key, 
    r.role_sort, r.data_scope,r.status, 
    r.del_flag, r.create_time, r.remark
@}
from sys_role r
left join sys_user_role ur on ur.role_id = r.role_id
left join sys_user u on u.user_id = ur.user_id
left join sys_dept d on u.dept_id = d.dept_id
where r.del_flag = '0'
@if(!isEmptyObj(params)){
    #text(params.dataScope)# 
@}
@if(!isBlank(roleName)){
    and  u.role_name like #'%'+roleName+'%'#
@}
@if(!isBlank(roleKey)){
    and  u.role_key like #'%'+roleKey+'%'#
@}
@if(!isBlank(status)){
    and  u.status = #status#
@}
@if(!isBlank(dataScope)){
    and  u.data_scope = #dataScope#
@}
@if(has(beginTime)&&beginTime != null){
   and  u.create_time>= #beginTime#
@}
@if(has(endTime)&& endTime != null){
    and  u.create_time<= #endTime#
@}

@pageIgnoreTag(){
    order by r.role_id 
@}
```

