package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsIntegrationConsumeSetting;
import java.util.List;
import com.ruoyi.ums.mapper.UmsIntegrationConsumeSettingMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsIntegrationConsumeSettingService extends ServiceImpl<UmsIntegrationConsumeSettingMapper, UmsIntegrationConsumeSetting> {

    
    public int updateBatch(List<UmsIntegrationConsumeSetting> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsIntegrationConsumeSetting> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsIntegrationConsumeSetting> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsIntegrationConsumeSetting record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsIntegrationConsumeSetting record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
