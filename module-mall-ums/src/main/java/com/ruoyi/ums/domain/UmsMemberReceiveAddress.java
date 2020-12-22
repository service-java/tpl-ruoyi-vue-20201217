package com.ruoyi.ums.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
/**
    * 会员收货地址表
    */
@ApiModel(value="com-ruoyi-ums-domain-UmsMemberReceiveAddress")
@Data
@TableName(value = "ums_member_receive_address")
public class UmsMemberReceiveAddress {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    /**
     * 收货人名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="收货人名称")
    private String name;

    @TableField(value = "phone_number")
    @ApiModelProperty(value="")
    private String phoneNumber;

    /**
     * 是否为默认
     */
    @TableField(value = "default_status")
    @ApiModelProperty(value="是否为默认")
    private Integer defaultStatus;

    /**
     * 邮政编码
     */
    @TableField(value = "post_code")
    @ApiModelProperty(value="邮政编码")
    private String postCode;

    /**
     * 省份/直辖市
     */
    @TableField(value = "province")
    @ApiModelProperty(value="省份/直辖市")
    private String province;

    /**
     * 城市
     */
    @TableField(value = "city")
    @ApiModelProperty(value="城市")
    private String city;

    /**
     * 区
     */
    @TableField(value = "region")
    @ApiModelProperty(value="区")
    private String region;

    /**
     * 详细地址(街道)
     */
    @TableField(value = "detail_address")
    @ApiModelProperty(value="详细地址(街道)")
    private String detailAddress;

    public static final String COL_ID = "id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_NAME = "name";

    public static final String COL_PHONE_NUMBER = "phone_number";

    public static final String COL_DEFAULT_STATUS = "default_status";

    public static final String COL_POST_CODE = "post_code";

    public static final String COL_PROVINCE = "province";

    public static final String COL_CITY = "city";

    public static final String COL_REGION = "region";

    public static final String COL_DETAIL_ADDRESS = "detail_address";
}