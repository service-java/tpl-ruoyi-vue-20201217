package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductVertifyRecord;
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
public interface PmsProductVertifyRecordMapper extends BaseMapper<PmsProductVertifyRecord> {
    int updateBatch(List<PmsProductVertifyRecord> list);

    int updateBatchSelective(List<PmsProductVertifyRecord> list);

    int batchInsert(@Param("list") List<PmsProductVertifyRecord> list);

    int insertOrUpdate(PmsProductVertifyRecord record);

    int insertOrUpdateSelective(PmsProductVertifyRecord record);
}
