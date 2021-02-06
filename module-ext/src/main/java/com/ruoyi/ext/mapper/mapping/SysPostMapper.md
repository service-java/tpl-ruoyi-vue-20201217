queryByCondition
===

```sql
select 
@pageTag(){
*
@}
from sys_post 
where 1=1
@if(!isBlank(postCode)){
    and  post_code like #'%'+postCode+'%'#
@}
@if(!isBlank(status)){
    and  status = #status#
@}
@if(!isBlank(postName)){
    and  post_name like #'%'+postName+'%'#
@}

@pageIgnoreTag(){
    order by post_id desc
@}
```

