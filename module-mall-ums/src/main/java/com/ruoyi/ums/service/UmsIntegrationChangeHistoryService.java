package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsIntegrationChangeHistory;
import com.ruoyi.ums.mapper.UmsIntegrationChangeHistoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsIntegrationChangeHistoryService extends ServiceImpl<UmsIntegrationChangeHistoryMapper, UmsIntegrationChangeHistory> {


    public int updateBatch(List<UmsIntegrationChangeHistory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsIntegrationChangeHistory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsIntegrationChangeHistory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsIntegrationChangeHistory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsIntegrationChangeHistory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
