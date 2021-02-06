package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberStatisticsInfo;
import com.ruoyi.ums.mapper.UmsMemberStatisticsInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberStatisticsInfoService extends ServiceImpl<UmsMemberStatisticsInfoMapper, UmsMemberStatisticsInfo> {


    public int updateBatch(List<UmsMemberStatisticsInfo> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberStatisticsInfo> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberStatisticsInfo> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberStatisticsInfo record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberStatisticsInfo record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
