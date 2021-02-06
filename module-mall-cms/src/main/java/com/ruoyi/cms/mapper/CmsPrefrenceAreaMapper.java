package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsPrefrenceArea;
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
public interface CmsPrefrenceAreaMapper extends BaseMapper<CmsPrefrenceArea> {
    int updateBatch(List<CmsPrefrenceArea> list);

    int updateBatchSelective(List<CmsPrefrenceArea> list);

    int batchInsert(@Param("list") List<CmsPrefrenceArea> list);

    int insertOrUpdate(CmsPrefrenceArea record);

    int insertOrUpdateSelective(CmsPrefrenceArea record);
}
