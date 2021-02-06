package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsNote;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-07 1:54
 */
@Mapper
public interface CmsNoteMapper extends BaseMapper<CmsNote> {
    int updateBatch(List<CmsNote> list);

    int updateBatchSelective(List<CmsNote> list);

    int batchInsert(@Param("list") List<CmsNote> list);

    int insertOrUpdate(CmsNote record);

    int insertOrUpdateSelective(CmsNote record);

    int insertOrUpdateWithBLOBs(CmsNote record);
}