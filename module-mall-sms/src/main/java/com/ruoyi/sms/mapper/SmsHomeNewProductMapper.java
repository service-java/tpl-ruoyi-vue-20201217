package com.ruoyi.sms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.sms.domain.SmsHomeNewProduct;
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
public interface SmsHomeNewProductMapper extends BaseMapper<SmsHomeNewProduct> {
    int updateBatch(List<SmsHomeNewProduct> list);

    int updateBatchSelective(List<SmsHomeNewProduct> list);

    int batchInsert(@Param("list") List<SmsHomeNewProduct> list);

    int insertOrUpdate(SmsHomeNewProduct record);

    int insertOrUpdateSelective(SmsHomeNewProduct record);
}
