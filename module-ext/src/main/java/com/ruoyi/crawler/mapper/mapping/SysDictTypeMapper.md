queryByCondition
===

```sql
select 
@pageTag(){
    dict_id, dict_name, dict_type, status, 
    create_by, create_time, remark 
@}
from sys_dict_type 
where 1=1
@if(!isBlank(dictName)){
    and  dict_name like #'%'+dictName+'%'#
@}
@if(!isBlank(status)){
    and  status = #status#
@}
@if(!isBlank(dictType)){
    and  dict_type like #'%'+dictType+'%'#
@}
@if(has(beginTime) && beginTime != null){
   and  create_time>= #beginTime#
@}
@if(has(beginTime) && endTime != null){
    and  create_time<= #endTime#
@}
@pageIgnoreTag(){
    order by dict_id 
@}
```

	
