package com.ruoyi.oms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.domain.OmsOrderReturnReason;
import com.ruoyi.oms.mapper.OmsOrderReturnReasonMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderReturnReasonService extends ServiceImpl<OmsOrderReturnReasonMapper, OmsOrderReturnReason> {


    public int updateBatch(List<OmsOrderReturnReason> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<OmsOrderReturnReason> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<OmsOrderReturnReason> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(OmsOrderReturnReason record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(OmsOrderReturnReason record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
