package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberRuleSetting;
import com.ruoyi.ums.mapper.UmsMemberRuleSettingMapper;
import org.springframework.stereotype.Service;

import java.util.List;
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
