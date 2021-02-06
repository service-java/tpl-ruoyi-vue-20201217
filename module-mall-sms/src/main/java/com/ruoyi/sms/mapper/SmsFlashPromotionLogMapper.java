package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsFlashPromotionLog;
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
public interface SmsFlashPromotionLogMapper extends BaseMapper<SmsFlashPromotionLog> {
    int updateBatch(List<SmsFlashPromotionLog> list);

    int updateBatchSelective(List<SmsFlashPromotionLog> list);

    int batchInsert(@Param("list") List<SmsFlashPromotionLog> list);

    int insertOrUpdate(SmsFlashPromotionLog record);

    int insertOrUpdateSelective(SmsFlashPromotionLog record);
}
