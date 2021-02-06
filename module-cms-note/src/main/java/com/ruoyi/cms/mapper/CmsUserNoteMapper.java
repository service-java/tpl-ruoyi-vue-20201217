package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsUserNote;

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
public interface CmsUserNoteMapper extends BaseMapper<CmsUserNote> {
    int updateBatch(List<CmsUserNote> list);

    int updateBatchSelective(List<CmsUserNote> list);

    int batchInsert(@Param("list") List<CmsUserNote> list);

    int insertOrUpdate(CmsUserNote record);

    int insertOrUpdateSelective(CmsUserNote record);
}
