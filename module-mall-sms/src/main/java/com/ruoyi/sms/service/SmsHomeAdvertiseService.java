package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsHomeAdvertise;
import com.ruoyi.sms.mapper.SmsHomeAdvertiseMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsHomeAdvertiseService extends ServiceImpl<SmsHomeAdvertiseMapper, SmsHomeAdvertise> {


    public int updateBatch(List<SmsHomeAdvertise> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsHomeAdvertise> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsHomeAdvertise> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsHomeAdvertise record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsHomeAdvertise record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
