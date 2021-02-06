package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2021-02-07 1:54
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsNote")
@Data
@TableName(value = "cms_note")
public class CmsNote implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "title")
    @ApiModelProperty(value = "")
    private String title;

    @TableField(value = "`type`")
    @ApiModelProperty(value = "")
    private Byte type;

    @TableField(value = "content")
    @ApiModelProperty(value = "")
    private byte[] content;

    @TableField(value = "gmt_create")
    @ApiModelProperty(value = "")
    private Date gmtCreate;

    @TableField(value = "gmt_modified")
    @ApiModelProperty(value = "")
    private Date gmtModified;

    @TableField(value = "is_deleted")
    @ApiModelProperty(value = "")
    private Byte isDeleted;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_TYPE = "type";

    public static final String COL_CONTENT = "content";

    public static final String COL_GMT_CREATE = "gmt_create";

    public static final String COL_GMT_MODIFIED = "gmt_modified";

    public static final String COL_IS_DELETED = "is_deleted";
}