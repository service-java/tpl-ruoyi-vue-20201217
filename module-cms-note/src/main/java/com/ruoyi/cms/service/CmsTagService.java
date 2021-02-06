package com.ruoyi.cms.service;

import com.ruoyi.cms.domain.CmsTag;
import com.ruoyi.cms.mapper.CmsTagMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2021-02-07 1:12
 */
@Service
public class CmsTagService extends ServiceImpl<CmsTagMapper, CmsTag> {


    public int updateBatch(List<CmsTag> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsTag> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsTag> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsTag record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsTag record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
