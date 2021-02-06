package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrderReturnApply;
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
public interface OmsOrderReturnApplyMapper extends BaseMapper<OmsOrderReturnApply> {
    int updateBatch(List<OmsOrderReturnApply> list);

    int updateBatchSelective(List<OmsOrderReturnApply> list);

    int batchInsert(@Param("list") List<OmsOrderReturnApply> list);

    int insertOrUpdate(OmsOrderReturnApply record);

    int insertOrUpdateSelective(OmsOrderReturnApply record);
}
