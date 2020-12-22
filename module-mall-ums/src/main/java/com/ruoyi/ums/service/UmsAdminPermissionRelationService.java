package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.domain.UmsAdminPermissionRelation;
import com.ruoyi.ums.mapper.UmsAdminPermissionRelationMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsAdminPermissionRelationService extends ServiceImpl<UmsAdminPermissionRelationMapper, UmsAdminPermissionRelation> {

    
    public int updateBatch(List<UmsAdminPermissionRelation> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsAdminPermissionRelation> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsAdminPermissionRelation> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsAdminPermissionRelation record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsAdminPermissionRelation record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
