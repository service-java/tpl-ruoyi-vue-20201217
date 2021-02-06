package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductLadder;
import com.ruoyi.pms.mapper.PmsProductLadderMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductLadderService extends ServiceImpl<PmsProductLadderMapper, PmsProductLadder> {


    public int updateBatch(List<PmsProductLadder> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductLadder> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductLadder> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductLadder record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductLadder record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
