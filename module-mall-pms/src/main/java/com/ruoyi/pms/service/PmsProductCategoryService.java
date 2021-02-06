package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductCategory;
import com.ruoyi.pms.mapper.PmsProductCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductCategoryService extends ServiceImpl<PmsProductCategoryMapper, PmsProductCategory> {


    public int updateBatch(List<PmsProductCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
