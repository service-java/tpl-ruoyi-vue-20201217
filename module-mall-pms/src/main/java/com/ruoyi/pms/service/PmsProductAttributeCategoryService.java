package com.ruoyi.pms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.pms.mapper.PmsProductAttributeCategoryMapper;
import com.ruoyi.pms.domain.PmsProductAttributeCategory;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsProductAttributeCategoryService extends ServiceImpl<PmsProductAttributeCategoryMapper, PmsProductAttributeCategory> {

    
    public int updateBatch(List<PmsProductAttributeCategory> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<PmsProductAttributeCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<PmsProductAttributeCategory> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(PmsProductAttributeCategory record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(PmsProductAttributeCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
