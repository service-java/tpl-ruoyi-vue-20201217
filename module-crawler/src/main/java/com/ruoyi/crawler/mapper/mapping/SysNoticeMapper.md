queryByCondition
===

```sql
select 
@pageTag(){
*
@}
from sys_notice 
where 1=1
@if(!isBlank(noticeTitle)){
    and  notice_title like #'%'+noticeTitle+'%'#
@}
@if(!isBlank(noticeType)){
    and  notice_type = #noticeType#
@}
@if(!isBlank(createBy)){
    and  create_by like #'%'+createBy+'%'#
@}
@pageIgnoreTag(){
order by notice_id desc
@}
```

