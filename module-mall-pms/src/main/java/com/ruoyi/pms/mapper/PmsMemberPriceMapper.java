package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsMemberPrice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsMemberPriceMapper extends BaseMapper<PmsMemberPrice> {
    int updateBatch(List<PmsMemberPrice> list);

    int updateBatchSelective(List<PmsMemberPrice> list);

    int batchInsert(@Param("list") List<PmsMemberPrice> list);

    int insertOrUpdate(PmsMemberPrice record);

    int insertOrUpdateSelective(PmsMemberPrice record);
}
