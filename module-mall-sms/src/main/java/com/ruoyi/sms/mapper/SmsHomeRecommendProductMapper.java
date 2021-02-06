package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsHomeRecommendProduct;
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
public interface SmsHomeRecommendProductMapper extends BaseMapper<SmsHomeRecommendProduct> {
    int updateBatch(List<SmsHomeRecommendProduct> list);

    int updateBatchSelective(List<SmsHomeRecommendProduct> list);

    int batchInsert(@Param("list") List<SmsHomeRecommendProduct> list);

    int insertOrUpdate(SmsHomeRecommendProduct record);

    int insertOrUpdateSelective(SmsHomeRecommendProduct record);
}
