package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberMemberTagRelation;
import com.ruoyi.ums.mapper.UmsMemberMemberTagRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberMemberTagRelationService extends ServiceImpl<UmsMemberMemberTagRelationMapper, UmsMemberMemberTagRelation> {


    public int updateBatch(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberMemberTagRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberMemberTagRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberMemberTagRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
