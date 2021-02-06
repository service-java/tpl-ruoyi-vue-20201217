package com.ruoyi.cms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.cms.domain.OssUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-16 9:11
 */
public interface OssUserMapper extends BaseMapper<OssUser> {
    int deleteByPrimaryKey(Long id);

    int insert(OssUser record);

    int insertOrUpdate(OssUser record);

    int insertOrUpdateSelective(OssUser record);

    int insertSelective(OssUser record);

    OssUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OssUser record);

    int updateByPrimaryKey(OssUser record);

    int updateBatch(List<OssUser> list);

    int updateBatchSelective(List<OssUser> list);

    int batchInsert(@Param("list") List<OssUser> list);
}
