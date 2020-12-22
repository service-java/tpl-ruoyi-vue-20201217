package com.ruoyi.ums.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsMember;
import java.util.List;
import com.ruoyi.ums.mapper.UmsMemberMapper;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsMemberService extends ServiceImpl<UmsMemberMapper, UmsMember> {

    
    public int updateBatch(List<UmsMember> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<UmsMember> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<UmsMember> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(UmsMember record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(UmsMember record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
