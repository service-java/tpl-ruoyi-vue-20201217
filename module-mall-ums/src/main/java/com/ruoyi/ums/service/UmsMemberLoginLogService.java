package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberLoginLog;
import com.ruoyi.ums.mapper.UmsMemberLoginLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberLoginLogService extends ServiceImpl<UmsMemberLoginLogMapper, UmsMemberLoginLog> {


    public int updateBatch(List<UmsMemberLoginLog> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberLoginLog> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberLoginLog> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberLoginLog record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberLoginLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
