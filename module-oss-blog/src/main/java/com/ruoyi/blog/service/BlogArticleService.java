package com.ruoyi.blog.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.ruoyi.blog.mapper.BlogArticleMapper;
import com.ruoyi.blog.domain.BlogArticle;
/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-17 10:14
 */
@Service
public class BlogArticleService extends ServiceImpl<BlogArticleMapper, BlogArticle> {

    
    public int updateBatch(List<BlogArticle> list) {
        return baseMapper.updateBatch(list);
    }
    
    public int updateBatchSelective(List<BlogArticle> list) {
        return baseMapper.updateBatchSelective(list);
    }
    
    public int batchInsert(List<BlogArticle> list) {
        return baseMapper.batchInsert(list);
    }
    
    public int insertOrUpdate(BlogArticle record) {
        return baseMapper.insertOrUpdate(record);
    }
    
    public int insertOrUpdateSelective(BlogArticle record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
