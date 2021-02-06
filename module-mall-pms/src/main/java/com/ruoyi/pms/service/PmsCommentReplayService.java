package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsCommentReplay;
import com.ruoyi.pms.mapper.PmsCommentReplayMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsCommentReplayService extends ServiceImpl<PmsCommentReplayMapper, PmsCommentReplay> {


    public int updateBatch(List<PmsCommentReplay> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsCommentReplay> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsCommentReplay> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsCommentReplay record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsCommentReplay record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
