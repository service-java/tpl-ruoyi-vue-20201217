package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsTopicComment;
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
public interface CmsTopicCommentMapper extends BaseMapper<CmsTopicComment> {
    int updateBatch(List<CmsTopicComment> list);

    int updateBatchSelective(List<CmsTopicComment> list);

    int batchInsert(@Param("list") List<CmsTopicComment> list);

    int insertOrUpdate(CmsTopicComment record);

    int insertOrUpdateSelective(CmsTopicComment record);
}
