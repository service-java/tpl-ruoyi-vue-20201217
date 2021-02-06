package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductAttribute;
import com.ruoyi.pms.mapper.PmsProductAttributeMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductAttributeService extends ServiceImpl<PmsProductAttributeMapper, PmsProductAttribute> {


    public int updateBatch(List<PmsProductAttribute> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductAttribute> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductAttribute> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductAttribute record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductAttribute record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
