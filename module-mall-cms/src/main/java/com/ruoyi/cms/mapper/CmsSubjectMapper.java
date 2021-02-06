package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.CmsSubject;
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
public interface CmsSubjectMapper extends BaseMapper<CmsSubject> {
    int updateBatch(List<CmsSubject> list);

    int updateBatchSelective(List<CmsSubject> list);

    int batchInsert(@Param("list") List<CmsSubject> list);

    int insertOrUpdate(CmsSubject record);

    int insertOrUpdateSelective(CmsSubject record);
}
