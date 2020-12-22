package com.ruoyi.cms.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.mapper.CmsMemberReportMapper;
import java.util.List;
import com.ruoyi.cms.domain.CmsMemberReport;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-22 16:13
 */
@Service
public class CmsMemberReportService extends ServiceImpl<CmsMemberReportMapper, CmsMemberReport> {


    public int batchInsert(List<CmsMemberReport> list) {
        return baseMapper.batchInsert(list);
    }

    public int insertOrUpdate(CmsMemberReport record) {
        return baseMapper.insertOrUpdate(record);
    }

    public int insertOrUpdateSelective(CmsMemberReport record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}

