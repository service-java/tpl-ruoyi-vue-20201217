package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsCouponProductRelation;
import com.ruoyi.sms.mapper.SmsCouponProductRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsCouponProductRelationService extends ServiceImpl<SmsCouponProductRelationMapper, SmsCouponProductRelation> {


    public int updateBatch(List<SmsCouponProductRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsCouponProductRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsCouponProductRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsCouponProductRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsCouponProductRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
