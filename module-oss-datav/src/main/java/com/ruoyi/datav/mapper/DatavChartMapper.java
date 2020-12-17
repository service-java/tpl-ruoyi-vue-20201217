package com.ruoyi.datav.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.datav.domain.DatavChart;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 18:50
 */
@Mapper
public interface DatavChartMapper extends BaseMapper<DatavChart> {
    int updateBatch(List<DatavChart> list);

    int updateBatchSelective(List<DatavChart> list);

    int batchInsert(@Param("list") List<DatavChart> list);

    int insertOrUpdate(DatavChart record);

    int insertOrUpdateSelective(DatavChart record);
}