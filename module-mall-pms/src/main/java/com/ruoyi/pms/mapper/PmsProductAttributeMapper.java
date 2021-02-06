package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductAttribute;
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
public interface PmsProductAttributeMapper extends BaseMapper<PmsProductAttribute> {
    int updateBatch(List<PmsProductAttribute> list);

    int updateBatchSelective(List<PmsProductAttribute> list);

    int batchInsert(@Param("list") List<PmsProductAttribute> list);

    int insertOrUpdate(PmsProductAttribute record);

    int insertOrUpdateSelective(PmsProductAttribute record);
}
