package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsHomeBrand;
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
public interface SmsHomeBrandMapper extends BaseMapper<SmsHomeBrand> {
    int updateBatch(List<SmsHomeBrand> list);

    int updateBatchSelective(List<SmsHomeBrand> list);

    int batchInsert(@Param("list") List<SmsHomeBrand> list);

    int insertOrUpdate(SmsHomeBrand record);

    int insertOrUpdateSelective(SmsHomeBrand record);
}
