package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsSubjectComment;
import com.ruoyi.cms.mapper.CmsSubjectCommentMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsSubjectCommentService extends ServiceImpl<CmsSubjectCommentMapper, CmsSubjectComment> {


    public int updateBatch(List<CmsSubjectComment> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsSubjectComment> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsSubjectComment> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsSubjectComment record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsSubjectComment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

