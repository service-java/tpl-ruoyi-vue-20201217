package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsTopic;
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
public interface CmsTopicMapper extends BaseMapper<CmsTopic> {
    int updateBatch(List<CmsTopic> list);

    int updateBatchSelective(List<CmsTopic> list);

    int batchInsert(@Param("list") List<CmsTopic> list);

    int insertOrUpdate(CmsTopic record);

    int insertOrUpdateSelective(CmsTopic record);
}
