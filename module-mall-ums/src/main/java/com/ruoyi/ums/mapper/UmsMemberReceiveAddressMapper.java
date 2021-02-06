package com.ruoyi.ums.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.ums.domain.UmsMemberReceiveAddress;
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
public interface UmsMemberReceiveAddressMapper extends BaseMapper<UmsMemberReceiveAddress> {
    int updateBatch(List<UmsMemberReceiveAddress> list);

    int updateBatchSelective(List<UmsMemberReceiveAddress> list);

    int batchInsert(@Param("list") List<UmsMemberReceiveAddress> list);

    int insertOrUpdate(UmsMemberReceiveAddress record);

    int insertOrUpdateSelective(UmsMemberReceiveAddress record);
}
