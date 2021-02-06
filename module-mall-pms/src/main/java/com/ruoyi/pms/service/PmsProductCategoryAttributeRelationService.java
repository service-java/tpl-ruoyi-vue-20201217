package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductCategoryAttributeRelation;
import com.ruoyi.pms.mapper.PmsProductCategoryAttributeRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductCategoryAttributeRelationService extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> {


    public int updateBatch(List<PmsProductCategoryAttributeRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductCategoryAttributeRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductCategoryAttributeRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductCategoryAttributeRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductCategoryAttributeRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
