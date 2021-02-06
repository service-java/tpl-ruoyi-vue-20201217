package com.ruoyi.pms.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.pms.domain.PmsBrand;
import com.ruoyi.pms.mapper.PmsBrandMapper;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
@Service
public class PmsBrandService extends ServiceImpl<PmsBrandMapper, PmsBrand> {


    public int updateBatch(List<PmsBrand> list) {
        return baseMapper.updateBatch(list);
    }

    public int updateBatchSelective(List<PmsBrand> list) {
        return baseMapper.updateBatchSelective(list);
    }

    public int batchInsert(List<PmsBrand> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(PmsBrand record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(PmsBrand record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
