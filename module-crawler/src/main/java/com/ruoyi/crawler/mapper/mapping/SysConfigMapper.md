queryByCondition
===

```sql
select 
@pageTag(){
*
@}
from sys_config 
where 1=1
@if(!isBlank(configName)){
    and  config_name like #'%'+configName+'%'#
@}
@if(!isBlank(configKey)){
    and  config_key like #'%'+configKey+'%'#
@}

@if(!isBlank(configType)){
    and  config_type = #configType#
@}
@if(beginTime != null){
   and  create_time>= #beginTime#
@}
@if(endTime != null){
    and  create_time<= #endTime#
@}

@pageIgnoreTag(){
order by config_id desc
@}
```


selectConfig
===

```sql
select * 
from sys_config 
where 1=1
@if(!isEmptyObj(configId)){
    and  config_id = #configId#
@}
@if(!isEmptyObj(configKey)){
    and  config_key = #configKey#
@}
```

selectConfigList
===

```sql
select * 
from sys_config 
where 1=1
@if(!isBlank(configName)){
    and  config_name = #'%'+configName+'%'#
@}
@if(!isBlank(configType)){
    and  config_type = #configType#
@}
@if(!isBlank(configKey)){
    and  config_key = #'%'+configKey+'%'#
@}
```



