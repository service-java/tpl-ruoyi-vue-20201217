package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductLadder;
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
public interface PmsProductLadderMapper extends BaseMapper<PmsProductLadder> {
    int updateBatch(List<PmsProductLadder> list);

    int updateBatchSelective(List<PmsProductLadder> list);

    int batchInsert(@Param("list") List<PmsProductLadder> list);

    int insertOrUpdate(PmsProductLadder record);

    int insertOrUpdateSelective(PmsProductLadder record);
}
