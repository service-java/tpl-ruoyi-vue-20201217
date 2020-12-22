package com.ruoyi.oms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.oms.mapper.OmsCompanyAddressMapper;
import com.ruoyi.oms.domain.OmsCompanyAddress;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
@Service
public class OmsCompanyAddressService extends ServiceImpl<OmsCompanyAddressMapper, OmsCompanyAddress> {

    
    public int updateBatch(List<OmsCompanyAddress> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<OmsCompanyAddress> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<OmsCompanyAddress> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(OmsCompanyAddress record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(OmsCompanyAddress record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
