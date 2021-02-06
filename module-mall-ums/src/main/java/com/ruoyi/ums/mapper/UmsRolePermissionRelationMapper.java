package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsRolePermissionRelation;
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
public interface UmsRolePermissionRelationMapper extends BaseMapper<UmsRolePermissionRelation> {
    int updateBatch(List<UmsRolePermissionRelation> list);

    int updateBatchSelective(List<UmsRolePermissionRelation> list);

    int batchInsert(@Param("list") List<UmsRolePermissionRelation> list);

    int insertOrUpdate(UmsRolePermissionRelation record);

    int insertOrUpdateSelective(UmsRolePermissionRelation record);
}
