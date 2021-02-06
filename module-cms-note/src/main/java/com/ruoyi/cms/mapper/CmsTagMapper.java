package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsTag;

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
public interface CmsTagMapper extends BaseMapper<CmsTag> {
    int updateBatch(List<CmsTag> list);

    int updateBatchSelective(List<CmsTag> list);

    int batchInsert(@Param("list") List<CmsTag> list);

    int insertOrUpdate(CmsTag record);

    int insertOrUpdateSelective(CmsTag record);
}
