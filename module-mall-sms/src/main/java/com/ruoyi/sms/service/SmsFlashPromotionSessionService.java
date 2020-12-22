package com.ruoyi.sms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.sms.mapper.SmsFlashPromotionSessionMapper;
import com.ruoyi.sms.domain.SmsFlashPromotionSession;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsFlashPromotionSessionService extends ServiceImpl<SmsFlashPromotionSessionMapper, SmsFlashPromotionSession> {

    
    public int updateBatch(List<SmsFlashPromotionSession> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<SmsFlashPromotionSession> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<SmsFlashPromotionSession> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(SmsFlashPromotionSession record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(SmsFlashPromotionSession record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
