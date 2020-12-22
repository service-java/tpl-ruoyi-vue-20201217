package com.ruoyi.oms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.oms.domain.OmsCartItem;
import com.ruoyi.oms.mapper.OmsCartItemMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsCartItemService extends ServiceImpl<OmsCartItemMapper, OmsCartItem> {

    
    public int updateBatch(List<OmsCartItem> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<OmsCartItem> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<OmsCartItem> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(OmsCartItem record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(OmsCartItem record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
