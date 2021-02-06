package com.ruoyi.datav.mapper;

import com.ruoyi.datav.domain.DatavChart;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

import java.util.List;


/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 18:50
 */
@SqlResource("DatavChartMapper")
public interface DatavChartMapper extends BaseMapper<DatavChart> {

    public List<DatavChart> queryDemo();
}
