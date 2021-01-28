package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.OssConfig;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-16 9:28
 */
@Mapper
public interface OssConfigMapper extends BaseMapper<OssConfig> {
    int updateBatch(List<OssConfig> list);

    int updateBatchSelective(List<OssConfig> list);

    int batchInsert(@Param("list") List<OssConfig> list);

    int insertOrUpdate(OssConfig record);

    int insertOrUpdateSelective(OssConfig record);

    /**
     * 根据key，查询value
     */
    OssConfig queryByKey(String paramKey);

    /**
     * 根据key，更新value
     */
    int updateValueByKey(@Param("paramKey") String paramKey, @Param("paramValue") String paramValue);
}
