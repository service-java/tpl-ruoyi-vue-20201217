package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsSubjectComment;
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
public interface CmsSubjectCommentMapper extends BaseMapper<CmsSubjectComment> {
    int updateBatch(List<CmsSubjectComment> list);

    int updateBatchSelective(List<CmsSubjectComment> list);

    int batchInsert(@Param("list") List<CmsSubjectComment> list);

    int insertOrUpdate(CmsSubjectComment record);

    int insertOrUpdateSelective(CmsSubjectComment record);
}
