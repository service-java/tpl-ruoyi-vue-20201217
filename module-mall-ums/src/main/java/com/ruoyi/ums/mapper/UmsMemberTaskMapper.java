package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberTask;
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
public interface UmsMemberTaskMapper extends BaseMapper<UmsMemberTask> {
    int updateBatch(List<UmsMemberTask> list);

    int updateBatchSelective(List<UmsMemberTask> list);

    int batchInsert(@Param("list") List<UmsMemberTask> list);

    int insertOrUpdate(UmsMemberTask record);

    int insertOrUpdateSelective(UmsMemberTask record);
}
