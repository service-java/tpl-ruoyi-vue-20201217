package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsAdminLoginLog;
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
public interface UmsAdminLoginLogMapper extends BaseMapper<UmsAdminLoginLog> {
    int updateBatch(List<UmsAdminLoginLog> list);

    int updateBatchSelective(List<UmsAdminLoginLog> list);

    int batchInsert(@Param("list") List<UmsAdminLoginLog> list);

    int insertOrUpdate(UmsAdminLoginLog record);

    int insertOrUpdateSelective(UmsAdminLoginLog record);
}
