package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberTask;
import com.ruoyi.ums.mapper.UmsMemberTaskMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberTaskService extends ServiceImpl<UmsMemberTaskMapper, UmsMemberTask> {


    public int updateBatch(List<UmsMemberTask> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberTask> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberTask> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberTask record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberTask record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
