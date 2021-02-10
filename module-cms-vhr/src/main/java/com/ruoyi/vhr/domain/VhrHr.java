package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrHr")
@Data
@TableName(value = "vhr_hr")
public class VhrHr {
    /**
     * hrID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "hrID")
    private Integer id;

    /**
     * 姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "姓名")
    private String name;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "手机号码")
    private String phone;

    /**
     * 住宅电话
     */
    @TableField(value = "telephone")
    @ApiModelProperty(value = "住宅电话")
    private String telephone;

    /**
     * 联系地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value = "联系地址")
    private String address;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "")
    private Boolean enabled;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value = "用户名")
    private String username;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value = "密码")
    private String password;

    @TableField(value = "userface")
    @ApiModelProperty(value = "")
    private String userface;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PHONE = "phone";

    public static final String COL_TELEPHONE = "telephone";

    public static final String COL_ADDRESS = "address";

    public static final String COL_ENABLED = "enabled";

    public static final String COL_USERNAME = "username";

    public static final String COL_PASSWORD = "password";

    public static final String COL_USERFACE = "userface";

    public static final String COL_REMARK = "remark";
}