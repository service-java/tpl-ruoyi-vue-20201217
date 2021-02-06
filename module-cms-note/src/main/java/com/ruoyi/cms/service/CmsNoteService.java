package com.ruoyi.cms.service;

import com.ruoyi.cms.mapper.CmsNoteMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsNote;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-07 1:12
 */
@Service
public class CmsNoteService extends ServiceImpl<CmsNoteMapper, CmsNote> {


    public int updateBatch(List<CmsNote> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsNote> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsNote> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsNote record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsNote record) {
        return baseMapper.insertOrUpdateSelective(record);
    }

    public int insertOrUpdateWithBLOBs(CmsNote record) {
        return baseMapper.insertOrUpdateWithBLOBs(record);
    }
}

