package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberProductCategoryRelation;
import com.ruoyi.ums.mapper.UmsMemberProductCategoryRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberProductCategoryRelationService extends ServiceImpl<UmsMemberProductCategoryRelationMapper, UmsMemberProductCategoryRelation> {


    public int updateBatch(List<UmsMemberProductCategoryRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberProductCategoryRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberProductCategoryRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberProductCategoryRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberProductCategoryRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
