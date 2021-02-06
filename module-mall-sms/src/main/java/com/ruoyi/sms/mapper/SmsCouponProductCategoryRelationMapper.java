package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsCouponProductCategoryRelation;
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
public interface SmsCouponProductCategoryRelationMapper extends BaseMapper<SmsCouponProductCategoryRelation> {
    int updateBatch(List<SmsCouponProductCategoryRelation> list);

    int updateBatchSelective(List<SmsCouponProductCategoryRelation> list);

    int batchInsert(@Param("list") List<SmsCouponProductCategoryRelation> list);

    int insertOrUpdate(SmsCouponProductCategoryRelation record);

    int insertOrUpdateSelective(SmsCouponProductCategoryRelation record);
}
