package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberLevel;
import com.ruoyi.ums.mapper.UmsMemberLevelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberLevelService extends ServiceImpl<UmsMemberLevelMapper, UmsMemberLevel> {


    public int updateBatch(List<UmsMemberLevel> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberLevel> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberLevel> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberLevel record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberLevel record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
