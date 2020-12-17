queryByCondition
===

```sql
select 
@pageTag(){
*
@} 
from sys_user_online 
where 1=1
@if(!isBlank(ipaddr)){
    and  ipaddr like #'%'+ipaddr+'%'#
@}
@if(!isBlank(login_name)){
    and  login_name like #'%'+loginName+'%'#
@}
@pageIgnoreTag(){
	order by last_access_time desc
@}
```
