package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsAdminPermissionRelation;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsAdminPermissionRelationMapper extends BaseMapper<UmsAdminPermissionRelation> {
    int updateBatch(List<UmsAdminPermissionRelation> list);

    int updateBatchSelective(List<UmsAdminPermissionRelation> list);

    int batchInsert(@Param("list") List<UmsAdminPermissionRelation> list);

    int insertOrUpdate(UmsAdminPermissionRelation record);

    int insertOrUpdateSelective(UmsAdminPermissionRelation record);
}