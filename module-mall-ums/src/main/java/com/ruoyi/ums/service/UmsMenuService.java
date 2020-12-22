package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsMenuMapper;
import com.ruoyi.ums.domain.UmsMenu;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMenuService extends ServiceImpl<UmsMenuMapper, UmsMenu> {

    
    public int updateBatch(List<UmsMenu> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsMenu> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsMenu> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsMenu record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsMenu record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
