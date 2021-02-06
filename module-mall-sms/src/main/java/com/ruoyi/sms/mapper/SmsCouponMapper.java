package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsCoupon;
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
public interface SmsCouponMapper extends BaseMapper<SmsCoupon> {
    int updateBatch(List<SmsCoupon> list);

    int updateBatchSelective(List<SmsCoupon> list);

    int batchInsert(@Param("list") List<SmsCoupon> list);

    int insertOrUpdate(SmsCoupon record);

    int insertOrUpdateSelective(SmsCoupon record);
}
