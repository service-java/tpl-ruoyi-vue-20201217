package com.ruoyi.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.pms.domain.PmsFeightTemplate;
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
public interface PmsFeightTemplateMapper extends BaseMapper<PmsFeightTemplate> {
    int updateBatch(List<PmsFeightTemplate> list);

    int updateBatchSelective(List<PmsFeightTemplate> list);

    int batchInsert(@Param("list") List<PmsFeightTemplate> list);

    int insertOrUpdate(PmsFeightTemplate record);

    int insertOrUpdateSelective(PmsFeightTemplate record);
}
