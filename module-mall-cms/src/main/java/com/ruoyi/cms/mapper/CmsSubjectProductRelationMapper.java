package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsSubjectProductRelation;
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
public interface CmsSubjectProductRelationMapper extends BaseMapper<CmsSubjectProductRelation> {
    int updateBatch(List<CmsSubjectProductRelation> list);

    int updateBatchSelective(List<CmsSubjectProductRelation> list);

    int batchInsert(@Param("list") List<CmsSubjectProductRelation> list);

    int insertOrUpdate(CmsSubjectProductRelation record);

    int insertOrUpdateSelective(CmsSubjectProductRelation record);
}
