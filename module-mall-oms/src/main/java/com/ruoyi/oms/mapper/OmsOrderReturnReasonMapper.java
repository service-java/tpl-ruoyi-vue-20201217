package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrderReturnReason;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Mapper
public interface OmsOrderReturnReasonMapper extends BaseMapper<OmsOrderReturnReason> {
    int updateBatch(List<OmsOrderReturnReason> list);

    int updateBatchSelective(List<OmsOrderReturnReason> list);

    int batchInsert(@Param("list") List<OmsOrderReturnReason> list);

    int insertOrUpdate(OmsOrderReturnReason record);

    int insertOrUpdateSelective(OmsOrderReturnReason record);
}