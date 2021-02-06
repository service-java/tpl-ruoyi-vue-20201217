package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsMemberReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:14
 */
@Mapper
public interface CmsMemberReportMapper extends BaseMapper<CmsMemberReport> {
    int batchInsert(@Param("list") List<CmsMemberReport> list);

    int insertOrUpdate(CmsMemberReport record);

    int insertOrUpdateSelective(CmsMemberReport record);
}
