package com.ruoyi.oms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.oms.domain.OmsCompanyAddress;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Mapper
public interface OmsCompanyAddressMapper extends BaseMapper<OmsCompanyAddress> {
    int updateBatch(List<OmsCompanyAddress> list);

    int updateBatchSelective(List<OmsCompanyAddress> list);

    int batchInsert(@Param("list") List<OmsCompanyAddress> list);

    int insertOrUpdate(OmsCompanyAddress record);

    int insertOrUpdateSelective(OmsCompanyAddress record);
}