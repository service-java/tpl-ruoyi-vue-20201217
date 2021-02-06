package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsResource;
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
public interface UmsResourceMapper extends BaseMapper<UmsResource> {
    int updateBatch(List<UmsResource> list);

    int updateBatchSelective(List<UmsResource> list);

    int batchInsert(@Param("list") List<UmsResource> list);

    int insertOrUpdate(UmsResource record);

    int insertOrUpdateSelective(UmsResource record);
}
