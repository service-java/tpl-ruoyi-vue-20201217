package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductAttributeCategory;
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
public interface PmsProductAttributeCategoryMapper extends BaseMapper<PmsProductAttributeCategory> {
    int updateBatch(List<PmsProductAttributeCategory> list);

    int updateBatchSelective(List<PmsProductAttributeCategory> list);

    int batchInsert(@Param("list") List<PmsProductAttributeCategory> list);

    int insertOrUpdate(PmsProductAttributeCategory record);

    int insertOrUpdateSelective(PmsProductAttributeCategory record);
}
