package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrderItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Mapper
public interface OmsOrderItemMapper extends BaseMapper<OmsOrderItem> {
    int updateBatch(List<OmsOrderItem> list);

    int updateBatchSelective(List<OmsOrderItem> list);

    int batchInsert(@Param("list") List<OmsOrderItem> list);

    int insertOrUpdate(OmsOrderItem record);

    int insertOrUpdateSelective(OmsOrderItem record);
}
