package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductCategoryAttributeRelation;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsProductCategoryAttributeRelationMapper extends BaseMapper<PmsProductCategoryAttributeRelation> {
    int updateBatch(List<PmsProductCategoryAttributeRelation> list);

    int updateBatchSelective(List<PmsProductCategoryAttributeRelation> list);

    int batchInsert(@Param("list") List<PmsProductCategoryAttributeRelation> list);

    int insertOrUpdate(PmsProductCategoryAttributeRelation record);

    int insertOrUpdateSelective(PmsProductCategoryAttributeRelation record);
}