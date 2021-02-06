package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsPermissionMapper extends BaseMapper<UmsPermission> {
    int updateBatch(List<UmsPermission> list);

    int updateBatchSelective(List<UmsPermission> list);

    int batchInsert(@Param("list") List<UmsPermission> list);

    int insertOrUpdate(UmsPermission record);

    int insertOrUpdateSelective(UmsPermission record);
}
