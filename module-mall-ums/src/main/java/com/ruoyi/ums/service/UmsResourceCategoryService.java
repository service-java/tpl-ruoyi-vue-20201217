package com.ruoyi.ums.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.ums.domain.UmsResourceCategory;
import com.ruoyi.ums.mapper.UmsResourceCategoryMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
@Service
public class UmsResourceCategoryService extends ServiceImpl<UmsResourceCategoryMapper, UmsResourceCategory> {


    public int updateBatch(List<UmsResourceCategory> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<UmsResourceCategory> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<UmsResourceCategory> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(UmsResourceCategory record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(UmsResourceCategory record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
