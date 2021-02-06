package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsHomeRecommendProduct;
import com.ruoyi.sms.mapper.SmsHomeRecommendProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsHomeRecommendProductService extends ServiceImpl<SmsHomeRecommendProductMapper, SmsHomeRecommendProduct> {


    public int updateBatch(List<SmsHomeRecommendProduct> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsHomeRecommendProduct> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsHomeRecommendProduct> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsHomeRecommendProduct record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsHomeRecommendProduct record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
