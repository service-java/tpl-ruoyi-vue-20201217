package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProduct;
import com.ruoyi.pms.mapper.PmsProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductService extends ServiceImpl<PmsProductMapper, PmsProduct> {


    public int updateBatch(List<PmsProduct> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProduct> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProduct> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProduct record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProduct record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
