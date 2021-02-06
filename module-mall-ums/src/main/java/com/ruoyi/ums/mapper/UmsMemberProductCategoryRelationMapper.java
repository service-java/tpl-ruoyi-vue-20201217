package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberProductCategoryRelation;
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
public interface UmsMemberProductCategoryRelationMapper extends BaseMapper<UmsMemberProductCategoryRelation> {
    int updateBatch(List<UmsMemberProductCategoryRelation> list);

    int updateBatchSelective(List<UmsMemberProductCategoryRelation> list);

    int batchInsert(@Param("list") List<UmsMemberProductCategoryRelation> list);

    int insertOrUpdate(UmsMemberProductCategoryRelation record);

    int insertOrUpdateSelective(UmsMemberProductCategoryRelation record);
}
