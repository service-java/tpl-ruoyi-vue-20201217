package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsResource;
import java.util.List;
import com.ruoyi.ums.mapper.UmsResourceMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsResourceService extends ServiceImpl<UmsResourceMapper, UmsResource> {

    
    public int updateBatch(List<UmsResource> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsResource> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsResource> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsResource record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsResource record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
