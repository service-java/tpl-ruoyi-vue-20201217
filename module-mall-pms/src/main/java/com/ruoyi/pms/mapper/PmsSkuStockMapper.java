package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsSkuStock;
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
public interface PmsSkuStockMapper extends BaseMapper<PmsSkuStock> {
    int updateBatch(List<PmsSkuStock> list);

    int updateBatchSelective(List<PmsSkuStock> list);

    int batchInsert(@Param("list") List<PmsSkuStock> list);

    int insertOrUpdate(PmsSkuStock record);

    int insertOrUpdateSelective(PmsSkuStock record);
}
