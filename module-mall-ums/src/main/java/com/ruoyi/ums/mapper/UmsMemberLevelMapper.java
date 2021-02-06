package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberLevel;
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
public interface UmsMemberLevelMapper extends BaseMapper<UmsMemberLevel> {
    int updateBatch(List<UmsMemberLevel> list);

    int updateBatchSelective(List<UmsMemberLevel> list);

    int batchInsert(@Param("list") List<UmsMemberLevel> list);

    int insertOrUpdate(UmsMemberLevel record);

    int insertOrUpdateSelective(UmsMemberLevel record);
}
