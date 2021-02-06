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
 * 帮助表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsHelp")
@Data
@TableName(value = "cms_help")
public class CmsHelp {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value = "")
    private Long categoryId;

    @TableField(value = "icon")
    @ApiModelProperty(value = "")
    private String icon;

    @TableField(value = "title")
    @ApiModelProperty(value = "")
    private String title;

    @TableField(value = "show_status")
    @ApiModelProperty(value = "")
    private Integer showStatus;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "read_count")
    @ApiModelProperty(value = "")
    private Integer readCount;

    @TableField(value = "content")
    @ApiModelProperty(value = "")
    private String content;

    public static final String COL_ID = "id";

    public static final String COL_CATEGORY_ID = "category_id";

    public static final String COL_ICON = "icon";

    public static final String COL_TITLE = "title";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_READ_COUNT = "read_count";

    public static final String COL_CONTENT = "content";
}
