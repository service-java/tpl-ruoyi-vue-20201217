package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsGrowthChangeHistory;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsGrowthChangeHistoryMapper extends BaseMapper<UmsGrowthChangeHistory> {
    int updateBatch(List<UmsGrowthChangeHistory> list);

    int updateBatchSelective(List<UmsGrowthChangeHistory> list);

    int batchInsert(@Param("list") List<UmsGrowthChangeHistory> list);

    int insertOrUpdate(UmsGrowthChangeHistory record);

    int insertOrUpdateSelective(UmsGrowthChangeHistory record);
}