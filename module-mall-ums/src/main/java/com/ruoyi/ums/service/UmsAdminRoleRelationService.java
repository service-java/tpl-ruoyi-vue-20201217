package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsAdminRoleRelation;
import com.ruoyi.ums.mapper.UmsAdminRoleRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsAdminRoleRelationService extends ServiceImpl<UmsAdminRoleRelationMapper, UmsAdminRoleRelation> {


    public int updateBatch(List<UmsAdminRoleRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsAdminRoleRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsAdminRoleRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsAdminRoleRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsAdminRoleRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
