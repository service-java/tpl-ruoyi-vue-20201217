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
    * 作者表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcAuthor")
@Data
@TableName(value = "nvc_author")
public class NvcAuthor {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
     * 邀请码
     */
    @TableField(value = "invite_code")
    @ApiModelProperty(value="邀请码")
    private String inviteCode;

    /**
     * 笔名
     */
    @TableField(value = "pen_name")
    @ApiModelProperty(value="笔名")
    private String penName;

    /**
     * 手机号码
     */
    @TableField(value = "tel_phone")
    @ApiModelProperty(value="手机号码")
    private String telPhone;

    /**
     * QQ或微信账号
     */
    @TableField(value = "chat_account")
    @ApiModelProperty(value="QQ或微信账号")
    private String chatAccount;

    /**
     * 电子邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="电子邮箱")
    private String email;

    /**
     * 作品方向，0：男频，1：女频
     */
    @TableField(value = "work_direction")
    @ApiModelProperty(value="作品方向，0：男频，1：女频")
    private Byte workDirection;

    /**
     * 0：正常，1：封禁
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="0：正常，1：封禁")
    private Byte status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_INVITE_CODE = "invite_code";

    public static final String COL_PEN_NAME = "pen_name";

    public static final String COL_TEL_PHONE = "tel_phone";

    public static final String COL_CHAT_ACCOUNT = "chat_account";

    public static final String COL_EMAIL = "email";

    public static final String COL_WORK_DIRECTION = "work_direction";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";
}