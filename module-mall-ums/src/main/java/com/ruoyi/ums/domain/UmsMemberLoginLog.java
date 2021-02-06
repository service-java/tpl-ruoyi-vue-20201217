package com.ruoyi.ums.domain;

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
 * Date: 2020-12-22 16:30
 */
/**
    * 会员登录记录
    */
@ApiModel(value="com-ruoyi-ums-domain-UmsMemberLoginLog")
@Data
@TableName(value = "ums_member_login_log")
public class UmsMemberLoginLog {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "ip")
    @ApiModelProperty(value="")
    private String ip;

    @TableField(value = "city")
    @ApiModelProperty(value="")
    private String city;

    /**
     * 登录类型：0->PC；1->android;2->ios;3->小程序
     */
    @TableField(value = "login_type")
    @ApiModelProperty(value="登录类型：0->PC；1->android;2->ios;3->小程序")
    private Integer loginType;

    @TableField(value = "province")
    @ApiModelProperty(value="")
    private String province;

    public static final String COL_ID = "id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_IP = "ip";

    public static final String COL_CITY = "city";

    public static final String COL_LOGIN_TYPE = "login_type";

    public static final String COL_PROVINCE = "province";
}
