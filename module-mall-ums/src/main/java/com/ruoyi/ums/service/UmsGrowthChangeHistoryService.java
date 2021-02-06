package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsGrowthChangeHistory;
import com.ruoyi.ums.mapper.UmsGrowthChangeHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsGrowthChangeHistoryService extends ServiceImpl<UmsGrowthChangeHistoryMapper, UmsGrowthChangeHistory> {


    public int updateBatch(List<UmsGrowthChangeHistory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsGrowthChangeHistory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsGrowthChangeHistory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsGrowthChangeHistory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsGrowthChangeHistory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
