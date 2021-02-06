package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsIntegrationChangeHistory;
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
public interface UmsIntegrationChangeHistoryMapper extends BaseMapper<UmsIntegrationChangeHistory> {
    int updateBatch(List<UmsIntegrationChangeHistory> list);

    int updateBatchSelective(List<UmsIntegrationChangeHistory> list);

    int batchInsert(@Param("list") List<UmsIntegrationChangeHistory> list);

    int insertOrUpdate(UmsIntegrationChangeHistory record);

    int insertOrUpdateSelective(UmsIntegrationChangeHistory record);
}
