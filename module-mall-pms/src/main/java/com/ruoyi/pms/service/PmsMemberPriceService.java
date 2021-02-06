package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsMemberPrice;
import com.ruoyi.pms.mapper.PmsMemberPriceMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsMemberPriceService extends ServiceImpl<PmsMemberPriceMapper, PmsMemberPrice> {


    public int updateBatch(List<PmsMemberPrice> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsMemberPrice> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsMemberPrice> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsMemberPrice record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsMemberPrice record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
