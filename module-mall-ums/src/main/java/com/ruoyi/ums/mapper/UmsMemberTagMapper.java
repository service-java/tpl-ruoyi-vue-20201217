package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberTag;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Mapper
public interface UmsMemberTagMapper extends BaseMapper<UmsMemberTag> {
    int updateBatch(List<UmsMemberTag> list);

    int updateBatchSelective(List<UmsMemberTag> list);

    int batchInsert(@Param("list") List<UmsMemberTag> list);

    int insertOrUpdate(UmsMemberTag record);

    int insertOrUpdateSelective(UmsMemberTag record);
}