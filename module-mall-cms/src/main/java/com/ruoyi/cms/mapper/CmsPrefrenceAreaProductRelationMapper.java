package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsPrefrenceAreaProductRelation;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:14
 */
@Mapper
public interface CmsPrefrenceAreaProductRelationMapper extends BaseMapper<CmsPrefrenceAreaProductRelation> {
    int updateBatch(List<CmsPrefrenceAreaProductRelation> list);

    int updateBatchSelective(List<CmsPrefrenceAreaProductRelation> list);

    int batchInsert(@Param("list") List<CmsPrefrenceAreaProductRelation> list);

    int insertOrUpdate(CmsPrefrenceAreaProductRelation record);

    int insertOrUpdateSelective(CmsPrefrenceAreaProductRelation record);
}
