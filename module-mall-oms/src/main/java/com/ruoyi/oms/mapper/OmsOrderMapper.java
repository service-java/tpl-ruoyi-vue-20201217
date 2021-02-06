package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrder;
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
public interface OmsOrderMapper extends BaseMapper<OmsOrder> {
    int updateBatch(List<OmsOrder> list);

    int updateBatchSelective(List<OmsOrder> list);

    int batchInsert(@Param("list") List<OmsOrder> list);

    int insertOrUpdate(OmsOrder record);

    int insertOrUpdateSelective(OmsOrder record);
}
