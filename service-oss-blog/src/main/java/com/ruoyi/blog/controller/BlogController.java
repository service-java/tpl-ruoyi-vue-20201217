package com.ruoyi.blog.controller;

import com.ruoyi.blog.domain.BlogArticle;
import com.ruoyi.blog.service.BlogArticleService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.validator.ValidatorUtils;
import com.ruoyi.common.validator.group.AddGroup;
import com.ruoyi.common.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 10:16
 */
@Api(tags="博客模块")
@RestController
@RequestMapping("/blog")
@Slf4j
public class BlogController {

    @Autowired
    private BlogArticleService blogArticleService;

    @Log(title = "列出Blog操作")
    @ApiOperation("listBlog")
    @GetMapping("/listBlog")
    public ResultVo listBlog() {
        List<BlogArticle> list = blogArticleService.list();
        return ResultVo.success(list);
    }


    @ApiOperation("saveBlog")
    @PostMapping("/saveBlog")
    public ResultVo saveBlog(@RequestBody BlogArticle blogArticle) {
        ValidatorUtils.validateEntity(blogArticle, AddGroup.class);

        return ResultVo.responseByBool(blogArticleService.save(blogArticle));
    }

}
