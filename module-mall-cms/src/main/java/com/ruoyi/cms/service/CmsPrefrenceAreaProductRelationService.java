package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsPrefrenceAreaProductRelation;
import com.ruoyi.cms.mapper.CmsPrefrenceAreaProductRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsPrefrenceAreaProductRelationService extends ServiceImpl<CmsPrefrenceAreaProductRelationMapper, CmsPrefrenceAreaProductRelation> {


    public int updateBatch(List<CmsPrefrenceAreaProductRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsPrefrenceAreaProductRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsPrefrenceAreaProductRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsPrefrenceAreaProductRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsPrefrenceAreaProductRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

