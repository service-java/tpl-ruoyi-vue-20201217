package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsFeightTemplate;
import com.ruoyi.pms.mapper.PmsFeightTemplateMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsFeightTemplateService extends ServiceImpl<PmsFeightTemplateMapper, PmsFeightTemplate> {


    public int updateBatch(List<PmsFeightTemplate> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsFeightTemplate> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsFeightTemplate> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsFeightTemplate record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsFeightTemplate record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
