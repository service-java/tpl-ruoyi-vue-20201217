package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbOrder")
@Data
@TableName(value = "tb_order")
public class TbOrder {
    /**
     * 订单id
     */
    @TableId(value = "order_id", type = IdType.INPUT)
    @ApiModelProperty(value="订单id")
    private String orderId;

    /**
     * 实付金额
     */
    @TableField(value = "payment")
    @ApiModelProperty(value="实付金额")
    private BigDecimal payment;

    /**
     * 支付类型 1在线支付 2货到付款
     */
    @TableField(value = "payment_type")
    @ApiModelProperty(value="支付类型 1在线支付 2货到付款")
    private Integer paymentType;

    /**
     * 邮费
     */
    @TableField(value = "post_fee")
    @ApiModelProperty(value="邮费")
    private BigDecimal postFee;

    /**
     * 状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态 0未付款 1已付款 2未发货 3已发货 4交易成功 5交易关闭 6交易失败")
    private Integer status;

    /**
     * 订单创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="订单创建时间")
    private Date createTime;

    /**
     * 订单更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="订单更新时间")
    private Date updateTime;

    /**
     * 付款时间
     */
    @TableField(value = "payment_time")
    @ApiModelProperty(value="付款时间")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @TableField(value = "consign_time")
    @ApiModelProperty(value="发货时间")
    private Date consignTime;

    /**
     * 交易完成时间
     */
    @TableField(value = "end_time")
    @ApiModelProperty(value="交易完成时间")
    private Date endTime;

    /**
     * 交易关闭时间
     */
    @TableField(value = "close_time")
    @ApiModelProperty(value="交易关闭时间")
    private Date closeTime;

    /**
     * 物流名称
     */
    @TableField(value = "shipping_name")
    @ApiModelProperty(value="物流名称")
    private String shippingName;

    /**
     * 物流单号
     */
    @TableField(value = "shipping_code")
    @ApiModelProperty(value="物流单号")
    private String shippingCode;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
     * 买家留言
     */
    @TableField(value = "buyer_message")
    @ApiModelProperty(value="买家留言")
    private String buyerMessage;

    /**
     * 买家昵称
     */
    @TableField(value = "buyer_nick")
    @ApiModelProperty(value="买家昵称")
    private String buyerNick;

    /**
     * 买家是否已经评价
     */
    @TableField(value = "buyer_comment")
    @ApiModelProperty(value="买家是否已经评价")
    private Boolean buyerComment;

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_PAYMENT = "payment";

    public static final String COL_PAYMENT_TYPE = "payment_type";

    public static final String COL_POST_FEE = "post_fee";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_PAYMENT_TIME = "payment_time";

    public static final String COL_CONSIGN_TIME = "consign_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_CLOSE_TIME = "close_time";

    public static final String COL_SHIPPING_NAME = "shipping_name";

    public static final String COL_SHIPPING_CODE = "shipping_code";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_BUYER_MESSAGE = "buyer_message";

    public static final String COL_BUYER_NICK = "buyer_nick";

    public static final String COL_BUYER_COMMENT = "buyer_comment";
}