package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsRoleResourceRelationMapper;
import com.ruoyi.ums.domain.UmsRoleResourceRelation;
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
