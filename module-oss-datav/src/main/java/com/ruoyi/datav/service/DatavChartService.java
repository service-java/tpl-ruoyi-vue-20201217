package com.ruoyi.datav.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.datav.domain.DatavChart;
import com.ruoyi.datav.mapper.DatavChartMapper;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 18:50
 */
@Service
public class DatavChartService extends ServiceImpl<DatavChartMapper, DatavChart> {

    public int updateBatch(List<DatavChart> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<DatavChart> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<DatavChart> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(DatavChart record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(DatavChart record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

