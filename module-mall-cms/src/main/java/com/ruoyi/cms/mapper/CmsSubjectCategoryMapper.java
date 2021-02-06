package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsSubjectCategory;
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
public interface CmsSubjectCategoryMapper extends BaseMapper<CmsSubjectCategory> {
    int updateBatch(List<CmsSubjectCategory> list);

    int updateBatchSelective(List<CmsSubjectCategory> list);

    int batchInsert(@Param("list") List<CmsSubjectCategory> list);

    int insertOrUpdate(CmsSubjectCategory record);

    int insertOrUpdateSelective(CmsSubjectCategory record);
}
