package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsRoleMenuRelation;
import com.ruoyi.ums.mapper.UmsRoleMenuRelationMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsRoleMenuRelationService extends ServiceImpl<UmsRoleMenuRelationMapper, UmsRoleMenuRelation> {


    public int updateBatch(List<UmsRoleMenuRelation> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsRoleMenuRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsRoleMenuRelation> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsRoleMenuRelation record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsRoleMenuRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
