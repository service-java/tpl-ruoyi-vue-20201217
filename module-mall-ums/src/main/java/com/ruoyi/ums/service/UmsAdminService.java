package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsAdmin;
import com.ruoyi.ums.mapper.UmsAdminMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsAdminService extends ServiceImpl<UmsAdminMapper, UmsAdmin> {


    public int updateBatch(List<UmsAdmin> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsAdmin> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsAdmin> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsAdmin record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsAdmin record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
