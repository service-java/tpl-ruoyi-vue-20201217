package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsMemberReceiveAddressMapper;
import com.ruoyi.ums.domain.UmsMemberReceiveAddress;
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
