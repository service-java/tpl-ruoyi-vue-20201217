package com.ruoyi.cms.domain;

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
 * Date: 2020-12-22 16:14
 */

/**
 * 优选专区
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsPrefrenceArea")
@Data
@TableName(value = "cms_prefrence_area")
public class CmsPrefrenceArea {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "sub_title")
    @ApiModelProperty(value = "")
    private String subTitle;

    /**
     * 展示图片
     */
    @TableField(value = "pic")
    @ApiModelProperty(value = "展示图片")
    private byte[] pic;

    @TableField(value = "sort")
    @ApiModelProperty(value = "")
    private Integer sort;

    @TableField(value = "show_status")
    @ApiModelProperty(value = "")
    private Integer showStatus;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SUB_TITLE = "sub_title";

    public static final String COL_PIC = "pic";

    public static final String COL_SORT = "sort";

    public static final String COL_SHOW_STATUS = "show_status";
}