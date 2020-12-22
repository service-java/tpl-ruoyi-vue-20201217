package com.ruoyi.cms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.mapper.CmsTopicCommentMapper;
import java.util.List;
import com.ruoyi.cms.domain.CmsTopicComment;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsTopicCommentService extends ServiceImpl<CmsTopicCommentMapper, CmsTopicComment> {


    public int updateBatch(List<CmsTopicComment> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsTopicComment> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsTopicComment> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsTopicComment record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsTopicComment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

