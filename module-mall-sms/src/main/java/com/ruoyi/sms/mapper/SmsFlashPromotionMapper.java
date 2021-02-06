package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsFlashPromotion;
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
public interface SmsFlashPromotionMapper extends BaseMapper<SmsFlashPromotion> {
    int updateBatch(List<SmsFlashPromotion> list);

    int updateBatchSelective(List<SmsFlashPromotion> list);

    int batchInsert(@Param("list") List<SmsFlashPromotion> list);

    int insertOrUpdate(SmsFlashPromotion record);

    int insertOrUpdateSelective(SmsFlashPromotion record);
}
