package com.ruoyi.nvc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2021-02-15 15:57
 */
/**
    * 小说评论回复表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookCommentReply")
@Data
@TableName(value = "nvc_book_comment_reply")
public class NvcBookCommentReply {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 评论ID
     */
    @TableField(value = "comment_id")
    @ApiModelProperty(value="评论ID")
    private Long commentId;

    /**
     * 回复内容
     */
    @TableField(value = "reply_content")
    @ApiModelProperty(value="回复内容")
    private String replyContent;

    /**
     * 审核状态，0：待审核，1：审核通过，2：审核不通过
     */
    @TableField(value = "audit_status")
    @ApiModelProperty(value="审核状态，0：待审核，1：审核通过，2：审核不通过")
    private Boolean auditStatus;

    /**
     * 回复用户ID
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="回复用户ID")
    private Date createTime;

    /**
     * 回复时间
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="回复时间")
    private Long createUserId;

    public static final String COL_ID = "id";

    public static final String COL_COMMENT_ID = "comment_id";

    public static final String COL_REPLY_CONTENT = "reply_content";

    public static final String COL_AUDIT_STATUS = "audit_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER_ID = "create_user_id";
}