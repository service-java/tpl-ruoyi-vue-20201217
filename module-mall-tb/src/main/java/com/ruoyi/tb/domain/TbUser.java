package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
    * 用户表
    */
@ApiModel(value="com-ruoyi-tb-domain-TbUser")
@Data
@TableName(value = "tb_user")
public class TbUser {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 密码 md5加密存储
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="密码 md5加密存储")
    private String password;

    /**
     * 注册手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="注册手机号")
    private String phone;

    /**
     * 注册邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="注册邮箱")
    private String email;

    @TableField(value = "sex")
    @ApiModelProperty(value="")
    private String sex;

    @TableField(value = "address")
    @ApiModelProperty(value="")
    private String address;

    @TableField(value = "`state`")
    @ApiModelProperty(value="")
    private Integer state;

    @TableField(value = "description")
    @ApiModelProperty(value="")
    private String description;

    @TableField(value = "role_id")
    @ApiModelProperty(value="")
    private Integer roleId;

    /**
     * 头像
     */
    @TableField(value = "`file`")
    @ApiModelProperty(value="头像")
    private String file;

    @TableField(value = "created")
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated")
    @ApiModelProperty(value="")
    private Date updated;

    public static final String COL_ID = "id";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_PHONE = "phone";

    public static final String COL_EMAIL = "email";

    public static final String COL_SEX = "sex";

    public static final String COL_ADDRESS = "address";

    public static final String COL_STATE = "state";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_FILE = "file";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}