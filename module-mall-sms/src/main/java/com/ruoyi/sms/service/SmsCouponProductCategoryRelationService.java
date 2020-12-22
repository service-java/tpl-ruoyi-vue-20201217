package com.ruoyi.sms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.sms.mapper.SmsCouponProductCategoryRelationMapper;
import com.ruoyi.sms.domain.SmsCouponProductCategoryRelation;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Service
public class SmsCouponProductCategoryRelationService extends ServiceImpl<SmsCouponProductCategoryRelationMapper, SmsCouponProductCategoryRelation> {

    
    public int updateBatch(List<SmsCouponProductCategoryRelation> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<SmsCouponProductCategoryRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<SmsCouponProductCategoryRelation> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(SmsCouponProductCategoryRelation record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(SmsCouponProductCategoryRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
