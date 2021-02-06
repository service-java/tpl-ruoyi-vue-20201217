package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsHomeRecommendSubject;
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
public interface SmsHomeRecommendSubjectMapper extends BaseMapper<SmsHomeRecommendSubject> {
    int updateBatch(List<SmsHomeRecommendSubject> list);

    int updateBatchSelective(List<SmsHomeRecommendSubject> list);

    int batchInsert(@Param("list") List<SmsHomeRecommendSubject> list);

    int insertOrUpdate(SmsHomeRecommendSubject record);

    int insertOrUpdateSelective(SmsHomeRecommendSubject record);
}
