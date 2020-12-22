package com.ruoyi.pms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.pms.mapper.PmsSkuStockMapper;
import com.ruoyi.pms.domain.PmsSkuStock;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsSkuStockService extends ServiceImpl<PmsSkuStockMapper, PmsSkuStock> {

    
    public int updateBatch(List<PmsSkuStock> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<PmsSkuStock> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<PmsSkuStock> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(PmsSkuStock record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(PmsSkuStock record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
