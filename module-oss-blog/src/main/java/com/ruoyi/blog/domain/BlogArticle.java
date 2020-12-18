package com.ruoyi.blog.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-18 9:00
 */
@ApiModel(value = "com-ruoyi-blog-domain-BlogArticle")
@Data
@TableName(value = "blog_article")
public class BlogArticle {
    private static final long serialVersionUID = 1L;
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "主键ID")
    private Integer id;

    /**
     * 文章名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "文章名称")
    private String name;

    /**
     * 公告内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value = "公告内容")
    private byte[] content;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_CONTENT = "content";
}