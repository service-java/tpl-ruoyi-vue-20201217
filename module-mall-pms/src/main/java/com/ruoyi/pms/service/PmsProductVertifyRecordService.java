package com.ruoyi.pms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.pms.mapper.PmsProductVertifyRecordMapper;
import com.ruoyi.pms.domain.PmsProductVertifyRecord;
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
