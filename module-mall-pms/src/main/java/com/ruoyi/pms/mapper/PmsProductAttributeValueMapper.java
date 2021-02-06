package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductAttributeValue;
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
public interface PmsProductAttributeValueMapper extends BaseMapper<PmsProductAttributeValue> {
    int updateBatch(List<PmsProductAttributeValue> list);

    int updateBatchSelective(List<PmsProductAttributeValue> list);

    int batchInsert(@Param("list") List<PmsProductAttributeValue> list);

    int insertOrUpdate(PmsProductAttributeValue record);

    int insertOrUpdateSelective(PmsProductAttributeValue record);
}
