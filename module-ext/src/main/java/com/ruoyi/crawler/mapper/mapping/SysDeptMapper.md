selectDeptCount
===

```sql
select count(1) 
from sys_dept 
where 1=1
@if(!isEmptyObj(deptId) ){
    and  dept_id = #deptId#
@}
@if(!isEmptyObj(parentId)){
    and  parent_id = #parentId#
@}
```


selectDeptList
===

```sql
select * 
from sys_dept d 
where d.del_flag = '0'
@if(!isEmptyObj(params)){
    #text(params.dataScope)# 
@}
@if(!isBlank(parentId) && parentId != 0){
    and  parent_id = #parentId#
@}
@if(!isBlank(deptName) ){
    and  dept_name like #deptName+'%'# 
@}
@if(!isBlank(status)){
    and  status = #status#
@}
@pageIgnoreTag(){
order by d.parent_id, d.order_num
@}
```
