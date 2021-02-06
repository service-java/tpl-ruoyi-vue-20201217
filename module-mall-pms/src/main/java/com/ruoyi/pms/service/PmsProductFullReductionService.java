package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductFullReduction;
import com.ruoyi.pms.mapper.PmsProductFullReductionMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductFullReductionService extends ServiceImpl<PmsProductFullReductionMapper, PmsProductFullReduction> {


    public int updateBatch(List<PmsProductFullReduction> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductFullReduction> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductFullReduction> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductFullReduction record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductFullReduction record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
