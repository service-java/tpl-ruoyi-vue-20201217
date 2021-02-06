package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberTag;
import com.ruoyi.ums.mapper.UmsMemberTagMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberTagService extends ServiceImpl<UmsMemberTagMapper, UmsMemberTag> {


    public int updateBatch(List<UmsMemberTag> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberTag> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberTag> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberTag record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberTag record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
