package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsGrowthChangeHistoryMapper;
import com.ruoyi.ums.domain.UmsGrowthChangeHistory;
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
