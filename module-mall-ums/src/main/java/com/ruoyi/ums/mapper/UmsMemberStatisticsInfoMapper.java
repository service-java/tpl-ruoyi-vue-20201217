package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberStatisticsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsMemberStatisticsInfoMapper extends BaseMapper<UmsMemberStatisticsInfo> {
    int updateBatch(List<UmsMemberStatisticsInfo> list);

    int updateBatchSelective(List<UmsMemberStatisticsInfo> list);

    int batchInsert(@Param("list") List<UmsMemberStatisticsInfo> list);

    int insertOrUpdate(UmsMemberStatisticsInfo record);

    int insertOrUpdateSelective(UmsMemberStatisticsInfo record);
}
