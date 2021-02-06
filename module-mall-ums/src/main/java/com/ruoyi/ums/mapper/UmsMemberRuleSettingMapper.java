package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberRuleSetting;
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
public interface UmsMemberRuleSettingMapper extends BaseMapper<UmsMemberRuleSetting> {
    int updateBatch(List<UmsMemberRuleSetting> list);

    int updateBatchSelective(List<UmsMemberRuleSetting> list);

    int batchInsert(@Param("list") List<UmsMemberRuleSetting> list);

    int insertOrUpdate(UmsMemberRuleSetting record);

    int insertOrUpdateSelective(UmsMemberRuleSetting record);
}
