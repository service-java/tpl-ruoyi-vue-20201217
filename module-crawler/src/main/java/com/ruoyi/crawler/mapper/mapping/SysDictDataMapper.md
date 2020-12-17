queryByCondition
===

```sql
select 
@pageTag(){
    dict_code, dict_sort, dict_label, dict_value, 
    dict_type, css_class, list_class, is_default, 
    status, create_by, 
    create_time, remark 
@}

from sys_dict_data 
where 1=1
@if(!isBlank(dictType)){
    and  dict_type = #dictType#
@}
@if(!isBlank(dictLabel)){
    and  dict_label = like #'%'+dictLabel+'%'#
@}
@if(!isBlank(status)){
    and  status like #status#
@}
    
@pageIgnoreTag(){
    order by dict_code 
@}
```
	
		
selectDictDataList
===

```sql
select * 
from sys_dict_data 
where 1=1
@if(!isBlank(dictType)){
    and  dict_type = #'%'+dictType+'%'#
@}
@if(!isBlank(dictLabel)){
    and  dict_label = #dictLabel#
@}
@if(!isBlank(status)){
    and  status = #status#
@}
```


selectDictDataByType
===

```sql
select * 
from sys_dict_data 
where status = '0' and dict_type = #dictType# 
order by dict_sort asc
```



selectDictLabel
===

```sql
select dict_label 
from sys_dict_data 
where dict_type = #dictType#  and dict_value = #dictValue#
```

