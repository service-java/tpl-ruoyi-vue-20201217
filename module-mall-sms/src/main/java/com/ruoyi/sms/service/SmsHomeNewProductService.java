package com.ruoyi.sms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.sms.domain.SmsHomeNewProduct;
import com.ruoyi.sms.mapper.SmsHomeNewProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsHomeNewProductService extends ServiceImpl<SmsHomeNewProductMapper, SmsHomeNewProduct> {


    public int updateBatch(List<SmsHomeNewProduct> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<SmsHomeNewProduct> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<SmsHomeNewProduct> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(SmsHomeNewProduct record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(SmsHomeNewProduct record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
