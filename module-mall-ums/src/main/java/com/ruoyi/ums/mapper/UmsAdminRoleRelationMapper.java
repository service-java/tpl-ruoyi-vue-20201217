package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsAdminRoleRelation;
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
public interface UmsAdminRoleRelationMapper extends BaseMapper<UmsAdminRoleRelation> {
    int updateBatch(List<UmsAdminRoleRelation> list);

    int updateBatchSelective(List<UmsAdminRoleRelation> list);

    int batchInsert(@Param("list") List<UmsAdminRoleRelation> list);

    int insertOrUpdate(UmsAdminRoleRelation record);

    int insertOrUpdateSelective(UmsAdminRoleRelation record);
}
