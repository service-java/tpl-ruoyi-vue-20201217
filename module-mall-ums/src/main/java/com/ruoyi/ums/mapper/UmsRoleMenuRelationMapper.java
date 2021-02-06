package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsRoleMenuRelation;
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
public interface UmsRoleMenuRelationMapper extends BaseMapper<UmsRoleMenuRelation> {
    int updateBatch(List<UmsRoleMenuRelation> list);

    int updateBatchSelective(List<UmsRoleMenuRelation> list);

    int batchInsert(@Param("list") List<UmsRoleMenuRelation> list);

    int insertOrUpdate(UmsRoleMenuRelation record);

    int insertOrUpdateSelective(UmsRoleMenuRelation record);
}
