package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductAttributeValue;
import com.ruoyi.pms.mapper.PmsProductAttributeValueMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductAttributeValueService extends ServiceImpl<PmsProductAttributeValueMapper, PmsProductAttributeValue> {


    public int updateBatch(List<PmsProductAttributeValue> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductAttributeValue> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductAttributeValue> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductAttributeValue record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductAttributeValue record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
