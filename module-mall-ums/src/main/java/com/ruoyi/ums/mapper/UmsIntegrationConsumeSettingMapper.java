package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsIntegrationConsumeSetting;
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
public interface UmsIntegrationConsumeSettingMapper extends BaseMapper<UmsIntegrationConsumeSetting> {
    int updateBatch(List<UmsIntegrationConsumeSetting> list);

    int updateBatchSelective(List<UmsIntegrationConsumeSetting> list);

    int batchInsert(@Param("list") List<UmsIntegrationConsumeSetting> list);

    int insertOrUpdate(UmsIntegrationConsumeSetting record);

    int insertOrUpdateSelective(UmsIntegrationConsumeSetting record);
}
