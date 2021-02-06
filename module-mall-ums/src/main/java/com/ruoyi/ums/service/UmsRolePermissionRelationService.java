package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsRolePermissionRelation;
import com.ruoyi.ums.mapper.UmsRolePermissionRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsRolePermissionRelationService extends ServiceImpl<UmsRolePermissionRelationMapper, UmsRolePermissionRelation> {


    public int updateBatch(List<UmsRolePermissionRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsRolePermissionRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsRolePermissionRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsRolePermissionRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsRolePermissionRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
