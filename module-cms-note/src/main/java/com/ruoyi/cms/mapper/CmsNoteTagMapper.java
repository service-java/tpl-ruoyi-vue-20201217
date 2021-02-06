package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsNoteTag;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2021-02-07 1:12
 */
@Mapper
public interface CmsNoteTagMapper extends BaseMapper<CmsNoteTag> {
    int updateBatch(List<CmsNoteTag> list);

    int updateBatchSelective(List<CmsNoteTag> list);

    int batchInsert(@Param("list") List<CmsNoteTag> list);

    int insertOrUpdate(CmsNoteTag record);

    int insertOrUpdateSelective(CmsNoteTag record);
}
