package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsBrand;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Mapper
public interface PmsBrandMapper extends BaseMapper<PmsBrand> {
    int updateBatch(List<PmsBrand> list);

    int updateBatchSelective(List<PmsBrand> list);

    int batchInsert(@Param("list") List<PmsBrand> list);

    int insertOrUpdate(PmsBrand record);

    int insertOrUpdateSelective(PmsBrand record);
}
