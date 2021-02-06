package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsRoleResourceRelation;
import com.ruoyi.ums.mapper.UmsRoleResourceRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsRoleResourceRelationService extends ServiceImpl<UmsRoleResourceRelationMapper, UmsRoleResourceRelation> {


    public int updateBatch(List<UmsRoleResourceRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsRoleResourceRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsRoleResourceRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsRoleResourceRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsRoleResourceRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
