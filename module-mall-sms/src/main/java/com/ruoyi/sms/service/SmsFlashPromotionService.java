package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsFlashPromotion;
import com.ruoyi.sms.mapper.SmsFlashPromotionMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsFlashPromotionService extends ServiceImpl<SmsFlashPromotionMapper, SmsFlashPromotion> {


    public int updateBatch(List<SmsFlashPromotion> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsFlashPromotion> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsFlashPromotion> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsFlashPromotion record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsFlashPromotion record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
