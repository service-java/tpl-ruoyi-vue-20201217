package com.ruoyi.pms.domain;

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
 * Date: 2020-12-22 16:32
 */
/**
    * 产品评价回复表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsCommentReplay")
@Data
@TableName(value = "pms_comment_replay")
public class PmsCommentReplay {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "comment_id")
    @ApiModelProperty(value="")
    private Long commentId;

    @TableField(value = "member_nick_name")
    @ApiModelProperty(value="")
    private String memberNickName;

    @TableField(value = "member_icon")
    @ApiModelProperty(value="")
    private String memberIcon;

    @TableField(value = "content")
    @ApiModelProperty(value="")
    private String content;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 评论人员类型；0->会员；1->管理员
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="评论人员类型；0->会员；1->管理员")
    private Integer type;

    public static final String COL_ID = "id";

    public static final String COL_COMMENT_ID = "comment_id";

    public static final String COL_MEMBER_NICK_NAME = "member_nick_name";

    public static final String COL_MEMBER_ICON = "member_icon";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_TYPE = "type";
}
