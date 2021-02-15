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
    * 小说评论表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookComment")
@Data
@TableName(value = "nvc_book_comment")
public class NvcBookComment {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    @ApiModelProperty(value="小说ID")
    private Long bookId;

    /**
     * 评价内容
     */
    @TableField(value = "comment_content")
    @ApiModelProperty(value="评价内容")
    private String commentContent;

    /**
     * 回复数量
     */
    @TableField(value = "reply_count")
    @ApiModelProperty(value="回复数量")
    private Integer replyCount;

    /**
     * 审核状态，0：待审核，1：审核通过，2：审核不通过
     */
    @TableField(value = "audit_status")
    @ApiModelProperty(value="审核状态，0：待审核，1：审核通过，2：审核不通过")
    private Boolean auditStatus;

    /**
     * 评价时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="评价时间")
    private Date createTime;

    /**
     * 评价人
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="评价人")
    private Long createUserId;

    public static final String COL_ID = "id";

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_COMMENT_CONTENT = "comment_content";

    public static final String COL_REPLY_COUNT = "reply_count";

    public static final String COL_AUDIT_STATUS = "audit_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER_ID = "create_user_id";
}