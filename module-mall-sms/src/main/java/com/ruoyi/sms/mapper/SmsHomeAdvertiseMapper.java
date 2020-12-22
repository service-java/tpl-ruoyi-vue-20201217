package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsHomeAdvertise;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
@Mapper
public interface SmsHomeAdvertiseMapper extends BaseMapper<SmsHomeAdvertise> {
    int updateBatch(List<SmsHomeAdvertise> list);

    int updateBatchSelective(List<SmsHomeAdvertise> list);

    int batchInsert(@Param("list") List<SmsHomeAdvertise> list);

    int insertOrUpdate(SmsHomeAdvertise record);

    int insertOrUpdateSelective(SmsHomeAdvertise record);
}