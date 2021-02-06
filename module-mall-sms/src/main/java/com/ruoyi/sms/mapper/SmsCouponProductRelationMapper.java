package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsCouponProductRelation;
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
public interface SmsCouponProductRelationMapper extends BaseMapper<SmsCouponProductRelation> {
    int updateBatch(List<SmsCouponProductRelation> list);

    int updateBatchSelective(List<SmsCouponProductRelation> list);

    int batchInsert(@Param("list") List<SmsCouponProductRelation> list);

    int insertOrUpdate(SmsCouponProductRelation record);

    int insertOrUpdateSelective(SmsCouponProductRelation record);
}
