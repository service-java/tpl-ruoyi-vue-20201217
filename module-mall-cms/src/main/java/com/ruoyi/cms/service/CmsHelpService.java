package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsHelp;
import com.ruoyi.cms.mapper.CmsHelpMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsHelpService extends ServiceImpl<CmsHelpMapper, CmsHelp> {


    public int updateBatch(List<CmsHelp> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsHelp> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsHelp> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsHelp record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsHelp record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

