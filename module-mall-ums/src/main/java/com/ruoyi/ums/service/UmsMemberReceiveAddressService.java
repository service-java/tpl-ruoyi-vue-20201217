package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMemberReceiveAddress;
import com.ruoyi.ums.mapper.UmsMemberReceiveAddressMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberReceiveAddressService extends ServiceImpl<UmsMemberReceiveAddressMapper, UmsMemberReceiveAddress> {


    public int updateBatch(List<UmsMemberReceiveAddress> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsMemberReceiveAddress> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsMemberReceiveAddress> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsMemberReceiveAddress record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsMemberReceiveAddress record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
