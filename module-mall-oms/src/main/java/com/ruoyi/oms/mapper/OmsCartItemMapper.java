package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsCartItem;
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
public interface OmsCartItemMapper extends BaseMapper<OmsCartItem> {
    int updateBatch(List<OmsCartItem> list);

    int updateBatchSelective(List<OmsCartItem> list);

    int batchInsert(@Param("list") List<OmsCartItem> list);

    int insertOrUpdate(OmsCartItem record);

    int insertOrUpdateSelective(OmsCartItem record);
}
