package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsSubjectCategory;
import com.ruoyi.cms.mapper.CmsSubjectCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsSubjectCategoryService extends ServiceImpl<CmsSubjectCategoryMapper, CmsSubjectCategory> {


    public int updateBatch(List<CmsSubjectCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsSubjectCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsSubjectCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsSubjectCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsSubjectCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

