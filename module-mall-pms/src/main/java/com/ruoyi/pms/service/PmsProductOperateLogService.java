package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsProductOperateLog;
import com.ruoyi.pms.mapper.PmsProductOperateLogMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductOperateLogService extends ServiceImpl<PmsProductOperateLogMapper, PmsProductOperateLog> {


    public int updateBatch(List<PmsProductOperateLog> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsProductOperateLog> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsProductOperateLog> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsProductOperateLog record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsProductOperateLog record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
