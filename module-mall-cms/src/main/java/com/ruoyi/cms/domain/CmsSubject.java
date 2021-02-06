package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:14
 */

/**
 * 专题表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsSubject")
@Data
@TableName(value = "cms_subject")
public class CmsSubject {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value = "")
    private Long categoryId;

    @TableField(value = "title")
    @ApiModelProperty(value = "")
    private String title;

    /**
     * 专题主图
     */
    @TableField(value = "pic")
    @ApiModelProperty(value = "专题主图")
    private String pic;

    /**
     * 关联产品数量
     */
    @TableField(value = "product_count")
    @ApiModelProperty(value = "关联产品数量")
    private Integer productCount;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value = "")
    private Integer recommendStatus;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "collect_count")
    @ApiModelProperty(value = "")
    private Integer collectCount;

    @TableField(value = "read_count")
    @ApiModelProperty(value = "")
    private Integer readCount;

    @TableField(value = "comment_count")
    @ApiModelProperty(value = "")
    private Integer commentCount;

    /**
     * 画册图片用逗号分割
     */
    @TableField(value = "album_pics")
    @ApiModelProperty(value = "画册图片用逗号分割")
    private String albumPics;

    @TableField(value = "description")
    @ApiModelProperty(value = "")
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    @ApiModelProperty(value = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @TableField(value = "content")
    @ApiModelProperty(value = "")
    private String content;

    /**
     * 转发数
     */
    @TableField(value = "forward_count")
    @ApiModelProperty(value = "转发数")
    private Integer forwardCount;

    /**
     * 专题分类名称
     */
    @TableField(value = "category_name")
    @ApiModelProperty(value = "专题分类名称")
    private String categoryName;

    public static final String COL_ID = "id";

    public static final String COL_CATEGORY_ID = "category_id";

    public static final String COL_TITLE = "title";

    public static final String COL_PIC = "pic";

    public static final String COL_PRODUCT_COUNT = "product_count";

    public static final String COL_RECOMMEND_STATUS = "recommend_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_COLLECT_COUNT = "collect_count";

    public static final String COL_READ_COUNT = "read_count";

    public static final String COL_COMMENT_COUNT = "comment_count";

    public static final String COL_ALBUM_PICS = "album_pics";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_CONTENT = "content";

    public static final String COL_FORWARD_COUNT = "forward_count";

    public static final String COL_CATEGORY_NAME = "category_name";
}
