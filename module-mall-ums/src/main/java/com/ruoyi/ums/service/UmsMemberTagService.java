package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.ums.mapper.UmsMemberTagMapper;
import com.ruoyi.ums.domain.UmsMemberTag;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberTagService extends ServiceImpl<UmsMemberTagMapper, UmsMemberTag> {

    
    public int updateBatch(List<UmsMemberTag> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsMemberTag> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsMemberTag> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsMemberTag record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsMemberTag record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
