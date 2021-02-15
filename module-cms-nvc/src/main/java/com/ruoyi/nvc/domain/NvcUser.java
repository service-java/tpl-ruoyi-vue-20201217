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
@ApiModel(value="com-ruoyi-nvc-domain-NvcUser")
@Data
@TableName(value = "nvc_user")
public class NvcUser {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 登录名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="登录名")
    private String username;

    /**
     * 登录密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="登录密码")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    @ApiModelProperty(value="昵称")
    private String nickName;

    /**
     * 用户头像
     */
    @TableField(value = "user_photo")
    @ApiModelProperty(value="用户头像")
    private String userPhoto;

    /**
     * 用户性别，0：男，1：女
     */
    @TableField(value = "user_sex")
    @ApiModelProperty(value="用户性别，0：男，1：女")
    private Boolean userSex;

    /**
     * 账户余额
     */
    @TableField(value = "account_balance")
    @ApiModelProperty(value="账户余额")
    private Long accountBalance;

    /**
     * 用户状态，0：正常
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="用户状态，0：正常")
    private Boolean status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_USER_PHOTO = "user_photo";

    public static final String COL_USER_SEX = "user_sex";

    public static final String COL_ACCOUNT_BALANCE = "account_balance";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}