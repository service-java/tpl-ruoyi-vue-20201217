package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsComment;
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
public interface PmsCommentMapper extends BaseMapper<PmsComment> {
    int updateBatch(List<PmsComment> list);

    int updateBatchSelective(List<PmsComment> list);

    int batchInsert(@Param("list") List<PmsComment> list);

    int insertOrUpdate(PmsComment record);

    int insertOrUpdateSelective(PmsComment record);
}
