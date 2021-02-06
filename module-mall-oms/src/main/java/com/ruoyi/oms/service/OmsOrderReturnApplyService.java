package com.ruoyi.oms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.domain.OmsOrderReturnApply;
import com.ruoyi.oms.mapper.OmsOrderReturnApplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderReturnApplyService extends ServiceImpl<OmsOrderReturnApplyMapper, OmsOrderReturnApply> {


    public int updateBatch(List<OmsOrderReturnApply> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<OmsOrderReturnApply> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<OmsOrderReturnApply> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(OmsOrderReturnApply record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(OmsOrderReturnApply record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
