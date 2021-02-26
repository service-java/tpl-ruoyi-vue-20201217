package com.ruoyi.cms.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruoyi.cms.domain.OssBucket;
import com.ruoyi.common.query.PageQuery;
import com.ruoyi.cms.util.PageQueryUtils;
import com.ruoyi.cms.mapper.OssBucketMapper;
import com.ruoyi.cms.vo.PageDataVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 图书Service业务层处理
 *
 * @author ruoyi
 * @date 2020-12-11
 */
@Service
@Slf4j
public class OssBucketService extends ServiceImpl<OssBucketMapper, OssBucket> {
    public PageDataVo page(PageQuery pageQuery, OssBucket ossBucket) {
        IPage<OssBucket> page = this.page(
                // 分页参数
                new PageQueryUtils<OssBucket>().convertIPage(pageQuery),
                // 查询参数
                new QueryWrapper<OssBucket>()
                        .like(StringUtils.isNotBlank(ossBucket.getName()),"name", ossBucket.getName())
                        .eq(ossBucket.getId() != null,"id", ossBucket.getId())
        );
        return new PageDataVo(page);
    }
}
