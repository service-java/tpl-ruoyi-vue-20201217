package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsCouponHistory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Mapper
public interface SmsCouponHistoryMapper extends BaseMapper<SmsCouponHistory> {
    int updateBatch(List<SmsCouponHistory> list);

    int updateBatchSelective(List<SmsCouponHistory> list);

    int batchInsert(@Param("list") List<SmsCouponHistory> list);

    int insertOrUpdate(SmsCouponHistory record);

    int insertOrUpdateSelective(SmsCouponHistory record);
}
