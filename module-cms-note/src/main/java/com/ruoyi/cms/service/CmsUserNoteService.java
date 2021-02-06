package com.ruoyi.cms.service;

import com.ruoyi.cms.domain.CmsUserNote;
import com.ruoyi.cms.mapper.CmsUserNoteMapper;
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
public class CmsUserNoteService extends ServiceImpl<CmsUserNoteMapper, CmsUserNote> {


    public int updateBatch(List<CmsUserNote> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsUserNote> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsUserNote> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsUserNote record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsUserNote record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
