package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsCoupon;
import com.ruoyi.sms.mapper.SmsCouponMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsCouponService extends ServiceImpl<SmsCouponMapper, SmsCoupon> {


    public int updateBatch(List<SmsCoupon> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsCoupon> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsCoupon> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsCoupon record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsCoupon record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
