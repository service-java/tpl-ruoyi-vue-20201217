package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsSubjectProductRelation;
import com.ruoyi.cms.mapper.CmsSubjectProductRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsSubjectProductRelationService extends ServiceImpl<CmsSubjectProductRelationMapper, CmsSubjectProductRelation> {


    public int updateBatch(List<CmsSubjectProductRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsSubjectProductRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsSubjectProductRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsSubjectProductRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsSubjectProductRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

