package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsFlashPromotionProductRelation;
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
public interface SmsFlashPromotionProductRelationMapper extends BaseMapper<SmsFlashPromotionProductRelation> {
    int updateBatch(List<SmsFlashPromotionProductRelation> list);

    int updateBatchSelective(List<SmsFlashPromotionProductRelation> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionProductRelation> list);

    int insertOrUpdate(SmsFlashPromotionProductRelation record);

    int insertOrUpdateSelective(SmsFlashPromotionProductRelation record);
}
