package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsPermission;
import com.ruoyi.ums.mapper.UmsPermissionMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsPermissionService extends ServiceImpl<UmsPermissionMapper, UmsPermission> {


    public int updateBatch(List<UmsPermission> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsPermission> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsPermission> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsPermission record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsPermission record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
