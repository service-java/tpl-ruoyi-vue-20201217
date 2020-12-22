package com.ruoyi.oms.domain;

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
 * Date: 2020-12-22 16:28
 */
/**
    * 公司收发货地址表
    */
@ApiModel(value="com-ruoyi-oms-domain-OmsCompanyAddress")
@Data
@TableName(value = "oms_company_address")
public class OmsCompanyAddress {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 地址名称
     */
    @TableField(value = "address_name")
    @ApiModelProperty(value="地址名称")
    private String addressName;

    /**
     * 默认发货地址：0->否；1->是
     */
    @TableField(value = "send_status")
    @ApiModelProperty(value="默认发货地址：0->否；1->是")
    private Integer sendStatus;

    /**
     * 是否默认收货地址：0->否；1->是
     */
    @TableField(value = "receive_status")
    @ApiModelProperty(value="是否默认收货地址：0->否；1->是")
    private Integer receiveStatus;

    /**
     * 收发货人姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="收发货人姓名")
    private String name;

    /**
     * 收货人电话
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="收货人电话")
    private String phone;

    /**
     * 省/直辖市
     */
    @TableField(value = "province")
    @ApiModelProperty(value="省/直辖市")
    private String province;

    /**
     * 市
     */
    @TableField(value = "city")
    @ApiModelProperty(value="市")
    private String city;

    /**
     * 区
     */
    @TableField(value = "region")
    @ApiModelProperty(value="区")
    private String region;

    /**
     * 详细地址
     */
    @TableField(value = "detail_address")
    @ApiModelProperty(value="详细地址")
    private String detailAddress;

    public static final String COL_ID = "id";

    public static final String COL_ADDRESS_NAME = "address_name";

    public static final String COL_SEND_STATUS = "send_status";

    public static final String COL_RECEIVE_STATUS = "receive_status";

    public static final String COL_NAME = "name";

    public static final String COL_PHONE = "phone";

    public static final String COL_PROVINCE = "province";

    public static final String COL_CITY = "city";

    public static final String COL_REGION = "region";

    public static final String COL_DETAIL_ADDRESS = "detail_address";
}