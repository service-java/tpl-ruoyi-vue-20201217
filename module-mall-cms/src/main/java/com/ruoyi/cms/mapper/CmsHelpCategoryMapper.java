package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsHelpCategory;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:14
 */
@Mapper
public interface CmsHelpCategoryMapper extends BaseMapper<CmsHelpCategory> {
    int updateBatch(List<CmsHelpCategory> list);

    int updateBatchSelective(List<CmsHelpCategory> list);

    int batchInsert(@Param("list") List<CmsHelpCategory> list);

    int insertOrUpdate(CmsHelpCategory record);

    int insertOrUpdateSelective(CmsHelpCategory record);
}