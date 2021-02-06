package com.ruoyi.oms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.domain.OmsCartItem;
import com.ruoyi.oms.mapper.OmsCartItemMapper;
import org.springframework.stereotype.Service;

import java.util.List;
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
