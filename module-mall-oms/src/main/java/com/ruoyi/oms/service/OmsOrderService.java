package com.ruoyi.oms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.domain.OmsOrder;
import com.ruoyi.oms.mapper.OmsOrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderService extends ServiceImpl<OmsOrderMapper, OmsOrder> {


    public int updateBatch(List<OmsOrder> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<OmsOrder> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<OmsOrder> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(OmsOrder record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(OmsOrder record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
