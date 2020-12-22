package com.ruoyi.oms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.oms.domain.OmsOrderItem;
import com.ruoyi.oms.mapper.OmsOrderItemMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderItemService extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> {

    
    public int updateBatch(List<OmsOrderItem> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<OmsOrderItem> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<OmsOrderItem> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(OmsOrderItem record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(OmsOrderItem record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
