package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsHelpCategory;
import com.ruoyi.cms.mapper.CmsHelpCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsHelpCategoryService extends ServiceImpl<CmsHelpCategoryMapper, CmsHelpCategory> {


    public int updateBatch(List<CmsHelpCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsHelpCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsHelpCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsHelpCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsHelpCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

