package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProduct;
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
public interface PmsProductMapper extends BaseMapper<PmsProduct> {
    int updateBatch(List<PmsProduct> list);

    int updateBatchSelective(List<PmsProduct> list);

    int batchInsert(@Param("list") List<PmsProduct> list);

    int insertOrUpdate(PmsProduct record);

    int insertOrUpdateSelective(PmsProduct record);
}
