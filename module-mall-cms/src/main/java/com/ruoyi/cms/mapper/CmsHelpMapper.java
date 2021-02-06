package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsHelp;
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
public interface CmsHelpMapper extends BaseMapper<CmsHelp> {
    int updateBatch(List<CmsHelp> list);

    int updateBatchSelective(List<CmsHelp> list);

    int batchInsert(@Param("list") List<CmsHelp> list);

    int insertOrUpdate(CmsHelp record);

    int insertOrUpdateSelective(CmsHelp record);
}
