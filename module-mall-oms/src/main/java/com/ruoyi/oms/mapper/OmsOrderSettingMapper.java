package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsOrderSetting;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Mapper
public interface OmsOrderSettingMapper extends BaseMapper<OmsOrderSetting> {
    int updateBatch(List<OmsOrderSetting> list);

    int updateBatchSelective(List<OmsOrderSetting> list);

    int batchInsert(@Param("list") List<OmsOrderSetting> list);

    int insertOrUpdate(OmsOrderSetting record);

    int insertOrUpdateSelective(OmsOrderSetting record);
}
