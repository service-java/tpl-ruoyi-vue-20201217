package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbOrderShipping")
@Data
@TableName(value = "tb_order_shipping")
public class TbOrderShipping {
    /**
     * 订单ID
     */
    @TableId(value = "order_id", type = IdType.INPUT)
    @ApiModelProperty(value="订单ID")
    private String orderId;

    /**
     * 收货人全名
     */
    @TableField(value = "receiver_name")
    @ApiModelProperty(value="收货人全名")
    private String receiverName;

    /**
     * 固定电话
     */
    @TableField(value = "receiver_phone")
    @ApiModelProperty(value="固定电话")
    private String receiverPhone;

    /**
     * 移动电话
     */
    @TableField(value = "receiver_mobile")
    @ApiModelProperty(value="移动电话")
    private String receiverMobile;

    /**
     * 省份
     */
    @TableField(value = "receiver_state")
    @ApiModelProperty(value="省份")
    private String receiverState;

    /**
     * 城市
     */
    @TableField(value = "receiver_city")
    @ApiModelProperty(value="城市")
    private String receiverCity;

    /**
     * 区/县
     */
    @TableField(value = "receiver_district")
    @ApiModelProperty(value="区/县")
    private String receiverDistrict;

    /**
     * 收货地址，如：xx路xx号
     */
    @TableField(value = "receiver_address")
    @ApiModelProperty(value="收货地址，如：xx路xx号")
    private String receiverAddress;

    /**
     * 邮政编码,如：310001
     */
    @TableField(value = "receiver_zip")
    @ApiModelProperty(value="邮政编码,如：310001")
    private String receiverZip;

    @TableField(value = "created")
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated")
    @ApiModelProperty(value="")
    private Date updated;

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_RECEIVER_NAME = "receiver_name";

    public static final String COL_RECEIVER_PHONE = "receiver_phone";

    public static final String COL_RECEIVER_MOBILE = "receiver_mobile";

    public static final String COL_RECEIVER_STATE = "receiver_state";

    public static final String COL_RECEIVER_CITY = "receiver_city";

    public static final String COL_RECEIVER_DISTRICT = "receiver_district";

    public static final String COL_RECEIVER_ADDRESS = "receiver_address";

    public static final String COL_RECEIVER_ZIP = "receiver_zip";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}