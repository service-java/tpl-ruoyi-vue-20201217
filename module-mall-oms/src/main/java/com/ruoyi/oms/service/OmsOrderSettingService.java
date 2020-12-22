package com.ruoyi.oms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.oms.mapper.OmsOrderSettingMapper;
import java.util.List;
import com.ruoyi.oms.domain.OmsOrderSetting;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsOrderSettingService extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> {

    
    public int updateBatch(List<OmsOrderSetting> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<OmsOrderSetting> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<OmsOrderSetting> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(OmsOrderSetting record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(OmsOrderSetting record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
