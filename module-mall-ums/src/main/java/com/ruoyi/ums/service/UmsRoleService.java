package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsRole;
import com.ruoyi.ums.mapper.UmsRoleMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsRoleService extends ServiceImpl<UmsRoleMapper, UmsRole> {


    public int updateBatch(List<UmsRole> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsRole> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsRole> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsRole record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsRole record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
