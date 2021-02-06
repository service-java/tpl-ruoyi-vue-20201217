package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductVertifyRecord;
import com.ruoyi.pms.mapper.PmsProductVertifyRecordMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductVertifyRecordService extends ServiceImpl<PmsProductVertifyRecordMapper, PmsProductVertifyRecord> {


    public int updateBatch(List<PmsProductVertifyRecord> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductVertifyRecord> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductVertifyRecord> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductVertifyRecord record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductVertifyRecord record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
