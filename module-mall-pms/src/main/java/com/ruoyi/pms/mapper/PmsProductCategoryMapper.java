package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsProductCategory;
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
public interface PmsProductCategoryMapper extends BaseMapper<PmsProductCategory> {
    int updateBatch(List<PmsProductCategory> list);

    int updateBatchSelective(List<PmsProductCategory> list);

    int batchInsert(@Param("list") List<PmsProductCategory> list);

    int insertOrUpdate(PmsProductCategory record);

    int insertOrUpdateSelective(PmsProductCategory record);
}
