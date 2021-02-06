package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsTopic;
import com.ruoyi.cms.mapper.CmsTopicMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsTopicService extends ServiceImpl<CmsTopicMapper, CmsTopic> {


    public int updateBatch(List<CmsTopic> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsTopic> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsTopic> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsTopic record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsTopic record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

