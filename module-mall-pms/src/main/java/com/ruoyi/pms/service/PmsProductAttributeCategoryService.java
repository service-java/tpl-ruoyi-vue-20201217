package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductAttributeCategory;
import com.ruoyi.pms.mapper.PmsProductAttributeCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductAttributeCategoryService extends ServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory> {


    public int updateBatch(List<PmsProductAttributeCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductAttributeCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductAttributeCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductAttributeCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductAttributeCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
