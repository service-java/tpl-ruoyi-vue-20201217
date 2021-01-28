package com.ruoyi.blog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ruoyi.blog.domain.BlogArticle;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-18 9:00
 */
@Mapper
public interface BlogArticleMapper extends BaseMapper<BlogArticle> {
    int updateBatch(List<BlogArticle> list);

    int updateBatchSelective(List<BlogArticle> list);

    int batchInsert(@Param("list") List<BlogArticle> list);

    int insertOrUpdate(BlogArticle record);

    int insertOrUpdateSelective(BlogArticle record);
}