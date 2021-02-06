package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberLoginLog;
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
public interface UmsMemberLoginLogMapper extends BaseMapper<UmsMemberLoginLog> {
    int updateBatch(List<UmsMemberLoginLog> list);

    int updateBatchSelective(List<UmsMemberLoginLog> list);

    int batchInsert(@Param("list") List<UmsMemberLoginLog> list);

    int insertOrUpdate(UmsMemberLoginLog record);

    int insertOrUpdateSelective(UmsMemberLoginLog record);
}
