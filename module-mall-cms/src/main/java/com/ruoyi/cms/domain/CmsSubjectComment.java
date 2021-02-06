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
 * 专题评论表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsSubjectComment")
@Data
@TableName(value = "cms_subject_comment")
public class CmsSubjectComment {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "subject_id")
    @ApiModelProperty(value = "")
    private Long subjectId;

    @TableField(value = "member_nick_name")
    @ApiModelProperty(value = "")
    private String memberNickName;

    @TableField(value = "member_icon")
    @ApiModelProperty(value = "")
    private String memberIcon;

    @TableField(value = "content")
    @ApiModelProperty(value = "")
    private String content;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "show_status")
    @ApiModelProperty(value = "")
    private Integer showStatus;

    public static final String COL_ID = "id";

    public static final String COL_SUBJECT_ID = "subject_id";

    public static final String COL_MEMBER_NICK_NAME = "member_nick_name";

    public static final String COL_MEMBER_ICON = "member_icon";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_SHOW_STATUS = "show_status";
}
