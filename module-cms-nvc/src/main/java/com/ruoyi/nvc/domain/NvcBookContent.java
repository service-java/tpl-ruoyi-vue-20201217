package com.ruoyi.nvc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2021-02-15 15:57
 */
/**
    * 小说内容表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookContent")
@Data
@TableName(value = "nvc_book_content")
public class NvcBookContent {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 目录ID
     */
    @TableField(value = "index_id")
    @ApiModelProperty(value="目录ID")
    private Long indexId;

    /**
     * 小说章节内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="小说章节内容")
    private String content;

    public static final String COL_ID = "id";

    public static final String COL_INDEX_ID = "index_id";

    public static final String COL_CONTENT = "content";
}