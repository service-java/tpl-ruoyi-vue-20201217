package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductOperateLog;
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
public interface PmsProductOperateLogMapper extends BaseMapper<PmsProductOperateLog> {
    int updateBatch(List<PmsProductOperateLog> list);

    int updateBatchSelective(List<PmsProductOperateLog> list);

    int batchInsert(@Param("list") List<PmsProductOperateLog> list);

    int insertOrUpdate(PmsProductOperateLog record);

    int insertOrUpdateSelective(PmsProductOperateLog record);
}
