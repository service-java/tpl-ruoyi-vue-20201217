package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsCommentReplay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsCommentReplayMapper extends BaseMapper<PmsCommentReplay> {
    int updateBatch(List<PmsCommentReplay> list);

    int updateBatchSelective(List<PmsCommentReplay> list);

    int batchInsert(@Param("list") List<PmsCommentReplay> list);

    int insertOrUpdate(PmsCommentReplay record);

    int insertOrUpdateSelective(PmsCommentReplay record);
}
