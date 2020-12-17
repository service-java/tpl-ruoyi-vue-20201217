queryByCondition
===

```sql
select @pageTag(){
    info_id,login_name,ipaddr,
    login_location,browser,os,
    status,msg,login_time
@}
from sys_logininfor
where 1=1
@if(!isBlank(ipaddr)){
    and  ipaddr like #'%'+ipaddr+'%'#
@}
@if(!isBlank(status)){
    and  status = #status#
@}
@if(!isBlank(loginName)){
    and  login_name in( #join(loginName)# )
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
order by info_id desc
@}
```

	
