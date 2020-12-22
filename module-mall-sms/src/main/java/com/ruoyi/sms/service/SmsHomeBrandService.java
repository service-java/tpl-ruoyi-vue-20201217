package com.ruoyi.sms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.sms.domain.SmsHomeBrand;
import com.ruoyi.sms.mapper.SmsHomeBrandMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsHomeBrandService extends ServiceImpl<SmsHomeBrandMapper, SmsHomeBrand> {

    
    public int updateBatch(List<SmsHomeBrand> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<SmsHomeBrand> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<SmsHomeBrand> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(SmsHomeBrand record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(SmsHomeBrand record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
