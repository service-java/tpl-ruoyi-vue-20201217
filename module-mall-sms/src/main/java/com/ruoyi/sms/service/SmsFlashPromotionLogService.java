package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsFlashPromotionLog;
import com.ruoyi.sms.mapper.SmsFlashPromotionLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsFlashPromotionLogService extends ServiceImpl<SmsFlashPromotionLogMapper, SmsFlashPromotionLog> {


    public int updateBatch(List<SmsFlashPromotionLog> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsFlashPromotionLog> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsFlashPromotionLog> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsFlashPromotionLog record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsFlashPromotionLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
