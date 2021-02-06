package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsCouponHistory;
import com.ruoyi.sms.mapper.SmsCouponHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsCouponHistoryService extends ServiceImpl<SmsCouponHistoryMapper, SmsCouponHistory> {


    public int updateBatch(List<SmsCouponHistory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsCouponHistory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsCouponHistory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsCouponHistory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsCouponHistory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
