package com.ruoyi.oms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.domain.OmsOrderOperateHistory;
import com.ruoyi.oms.mapper.OmsOrderOperateHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderOperateHistoryService extends ServiceImpl<OmsOrderOperateHistoryMapper, OmsOrderOperateHistory> {


    public int updateBatch(List<OmsOrderOperateHistory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<OmsOrderOperateHistory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<OmsOrderOperateHistory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(OmsOrderOperateHistory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(OmsOrderOperateHistory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
