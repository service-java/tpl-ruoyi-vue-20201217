package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberMemberTagRelation;
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
public interface UmsMemberMemberTagRelationMapper extends BaseMapper<UmsMemberMemberTagRelation> {
    int updateBatch(List<UmsMemberMemberTagRelation> list);

    int updateBatchSelective(List<UmsMemberMemberTagRelation> list);

    int batchInsert(@Param("list") List<UmsMemberMemberTagRelation> list);

    int insertOrUpdate(UmsMemberMemberTagRelation record);

    int insertOrUpdateSelective(UmsMemberMemberTagRelation record);
}
