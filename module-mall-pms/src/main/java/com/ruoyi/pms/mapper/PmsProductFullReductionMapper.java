package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductFullReduction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsProductFullReductionMapper extends BaseMapper<PmsProductFullReduction> {
    int updateBatch(List<PmsProductFullReduction> list);

    int updateBatchSelective(List<PmsProductFullReduction> list);

    int batchInsert(@Param("list") List<PmsProductFullReduction> list);

    int insertOrUpdate(PmsProductFullReduction record);

    int insertOrUpdateSelective(PmsProductFullReduction record);
}
