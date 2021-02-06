package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsResourceCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsResourceCategoryMapper extends BaseMapper<UmsResourceCategory> {
    int updateBatch(List<UmsResourceCategory> list);

    int updateBatchSelective(List<UmsResourceCategory> list);

    int batchInsert(@Param("list") List<UmsResourceCategory> list);

    int insertOrUpdate(UmsResourceCategory record);

    int insertOrUpdateSelective(UmsResourceCategory record);
}
