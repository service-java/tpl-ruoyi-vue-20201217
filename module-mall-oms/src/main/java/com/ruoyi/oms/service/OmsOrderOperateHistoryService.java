package com.ruoyi.oms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.oms.mapper.OmsOrderOperateHistoryMapper;
import com.ruoyi.oms.domain.OmsOrderOperateHistory;
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
