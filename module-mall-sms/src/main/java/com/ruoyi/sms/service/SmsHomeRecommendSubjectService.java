package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsHomeRecommendSubject;
import com.ruoyi.sms.mapper.SmsHomeRecommendSubjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsHomeRecommendSubjectService extends ServiceImpl<SmsHomeRecommendSubjectMapper, SmsHomeRecommendSubject> {


    public int updateBatch(List<SmsHomeRecommendSubject> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsHomeRecommendSubject> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsHomeRecommendSubject> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsHomeRecommendSubject record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsHomeRecommendSubject record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
