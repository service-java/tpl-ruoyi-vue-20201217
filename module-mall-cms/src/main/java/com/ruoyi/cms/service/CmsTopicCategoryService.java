package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsTopicCategory;
import com.ruoyi.cms.mapper.CmsTopicCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsTopicCategoryService extends ServiceImpl<CmsTopicCategoryMapper, CmsTopicCategory> {


    public int updateBatch(List<CmsTopicCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsTopicCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsTopicCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsTopicCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsTopicCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

