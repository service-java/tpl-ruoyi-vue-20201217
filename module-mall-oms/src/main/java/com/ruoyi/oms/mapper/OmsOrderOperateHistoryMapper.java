package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrderOperateHistory;
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
public interface OmsOrderOperateHistoryMapper extends BaseMapper<OmsOrderOperateHistory> {
    int updateBatch(List<OmsOrderOperateHistory> list);

    int updateBatchSelective(List<OmsOrderOperateHistory> list);

    int batchInsert(@Param("list") List<OmsOrderOperateHistory> list);

    int insertOrUpdate(OmsOrderOperateHistory record);

    int insertOrUpdateSelective(OmsOrderOperateHistory record);
}
