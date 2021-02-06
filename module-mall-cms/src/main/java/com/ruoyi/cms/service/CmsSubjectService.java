package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsSubject;
import com.ruoyi.cms.mapper.CmsSubjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsSubjectService extends ServiceImpl<CmsSubjectMapper, CmsSubject> {


    public int updateBatch(List<CmsSubject> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsSubject> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsSubject> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsSubject record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsSubject record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

