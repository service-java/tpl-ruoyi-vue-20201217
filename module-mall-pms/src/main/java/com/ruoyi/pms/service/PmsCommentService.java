package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsComment;
import com.ruoyi.pms.mapper.PmsCommentMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsCommentService extends ServiceImpl<PmsCommentMapper, PmsComment> {


    public int updateBatch(List<PmsComment> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsComment> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsComment> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsComment record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsComment record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
