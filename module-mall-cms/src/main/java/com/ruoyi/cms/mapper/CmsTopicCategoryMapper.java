package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsTopicCategory;
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
public interface CmsTopicCategoryMapper extends BaseMapper<CmsTopicCategory> {
    int updateBatch(List<CmsTopicCategory> list);

    int updateBatchSelective(List<CmsTopicCategory> list);

    int batchInsert(@Param("list") List<CmsTopicCategory> list);

    int insertOrUpdate(CmsTopicCategory record);

    int insertOrUpdateSelective(CmsTopicCategory record);
}
