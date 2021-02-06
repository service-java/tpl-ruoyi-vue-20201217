package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMenu;
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
public interface UmsMenuMapper extends BaseMapper<UmsMenu> {
    int updateBatch(List<UmsMenu> list);

    int updateBatchSelective(List<UmsMenu> list);

    int batchInsert(@Param("list") List<UmsMenu> list);

    int insertOrUpdate(UmsMenu record);

    int insertOrUpdateSelective(UmsMenu record);
}
