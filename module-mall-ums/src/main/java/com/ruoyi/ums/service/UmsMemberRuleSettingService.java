package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsMemberRuleSettingMapper;
import com.ruoyi.ums.domain.UmsMemberRuleSetting;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberRuleSettingService extends ServiceImpl<UmsMemberRuleSettingMapper, UmsMemberRuleSetting> {

    
    public int updateBatch(List<UmsMemberRuleSetting> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsMemberRuleSetting> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsMemberRuleSetting> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsMemberRuleSetting record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsMemberRuleSetting record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
