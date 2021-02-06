package com.ruoyi.cms.service;

import com.ruoyi.cms.mapper.CmsNoteTagMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsNoteTag;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2021-02-07 1:12
 */
@Service
public class CmsNoteTagService extends ServiceImpl<CmsNoteTagMapper, CmsNoteTag> {


    public int updateBatch(List<CmsNoteTag> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsNoteTag> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsNoteTag> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsNoteTag record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsNoteTag record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
