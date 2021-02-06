package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsAdmin;
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
public interface UmsAdminMapper extends BaseMapper<UmsAdmin> {
    int updateBatch(List<UmsAdmin> list);

    int updateBatchSelective(List<UmsAdmin> list);

    int batchInsert(@Param("list") List<UmsAdmin> list);

    int insertOrUpdate(UmsAdmin record);

    int insertOrUpdateSelective(UmsAdmin record);
}
