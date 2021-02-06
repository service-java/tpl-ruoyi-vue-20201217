package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.CmsPrefrenceArea;
import com.ruoyi.cms.mapper.CmsPrefrenceAreaMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsPrefrenceAreaService extends ServiceImpl<CmsPrefrenceAreaMapper, CmsPrefrenceArea> {


    public int updateBatch(List<CmsPrefrenceArea> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<CmsPrefrenceArea> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<CmsPrefrenceArea> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsPrefrenceArea record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsPrefrenceArea record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

