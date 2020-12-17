queryByCondition
===

```sql
select @pageTag(){
    oper_id, title, business_type, method, request_method, 
    operator_type, oper_name,dept_name,oper_url, 
    oper_ip, oper_location, oper_param, json_result, 
    status, error_msg, oper_time
@}
from sys_oper_log
where 1=1
@if(!isBlank(title)){
    and  title like #'%'+title+'%'#
@}
@if(!isBlank(businessType)){
    and  business_type in( #join(businessTypes)# )
@}
@if(!isBlank(status)){
    and  status = #status#
@}
@if(!isBlank(operName)){
    and  oper_name = #'%'+operName+'%'#
@}

@if(beginTime != null){
   and  create_time>= #beginTime#
@}
@if(endTime != null){
    and  create_time<= #endTime#
@}
@pageIgnoreTag(){
order by oper_id desc
@}
```



