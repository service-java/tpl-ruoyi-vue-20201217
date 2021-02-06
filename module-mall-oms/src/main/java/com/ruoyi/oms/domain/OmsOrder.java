package com.ruoyi.oms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:28
 */
/**
    * 订单表
    */
@ApiModel(value="com-ruoyi-oms-domain-OmsOrder")
@Data
@TableName(value = "oms_order")
public class OmsOrder {
    /**
     * 订单id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="订单id")
    private Long id;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    /**
     * 订单编号
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value="订单编号")
    private String orderSn;

    /**
     * 提交时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="提交时间")
    private Date createTime;

    /**
     * 用户帐号
     */
    @TableField(value = "member_username")
    @ApiModelProperty(value="用户帐号")
    private String memberUsername;

    /**
     * 订单总金额
     */
    @TableField(value = "total_amount")
    @ApiModelProperty(value="订单总金额")
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     */
    @TableField(value = "pay_amount")
    @ApiModelProperty(value="应付金额（实际支付金额）")
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    @TableField(value = "freight_amount")
    @ApiModelProperty(value="运费金额")
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @TableField(value = "promotion_amount")
    @ApiModelProperty(value="促销优化金额（促销价、满减、阶梯价）")
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    @TableField(value = "integration_amount")
    @ApiModelProperty(value="积分抵扣金额")
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    @TableField(value = "coupon_amount")
    @ApiModelProperty(value="优惠券抵扣金额")
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    @TableField(value = "discount_amount")
    @ApiModelProperty(value="管理员后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    @TableField(value = "pay_type")
    @ApiModelProperty(value="支付方式：0->未支付；1->支付宝；2->微信")
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    @TableField(value = "source_type")
    @ApiModelProperty(value="订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    @TableField(value = "order_type")
    @ApiModelProperty(value="订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    @TableField(value = "delivery_company")
    @ApiModelProperty(value="物流公司(配送方式)")
    private String deliveryCompany;

    /**
     * 物流单号
     */
    @TableField(value = "delivery_sn")
    @ApiModelProperty(value="物流单号")
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    @TableField(value = "auto_confirm_day")
    @ApiModelProperty(value="自动确认时间（天）")
    private Integer autoConfirmDay;

    /**
     * 可以获得的积分
     */
    @TableField(value = "integration")
    @ApiModelProperty(value="可以获得的积分")
    private Integer integration;

    /**
     * 可以活动的成长值
     */
    @TableField(value = "growth")
    @ApiModelProperty(value="可以活动的成长值")
    private Integer growth;

    /**
     * 活动信息
     */
    @TableField(value = "promotion_info")
    @ApiModelProperty(value="活动信息")
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    @TableField(value = "bill_type")
    @ApiModelProperty(value="发票类型：0->不开发票；1->电子发票；2->纸质发票")
    private Integer billType;

    /**
     * 发票抬头
     */
    @TableField(value = "bill_header")
    @ApiModelProperty(value="发票抬头")
    private String billHeader;

    /**
     * 发票内容
     */
    @TableField(value = "bill_content")
    @ApiModelProperty(value="发票内容")
    private String billContent;

    /**
     * 收票人电话
     */
    @TableField(value = "bill_receiver_phone")
    @ApiModelProperty(value="收票人电话")
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    @TableField(value = "bill_receiver_email")
    @ApiModelProperty(value="收票人邮箱")
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    @TableField(value = "receiver_name")
    @ApiModelProperty(value="收货人姓名")
    private String receiverName;

    /**
     * 收货人电话
     */
    @TableField(value = "receiver_phone")
    @ApiModelProperty(value="收货人电话")
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @TableField(value = "receiver_post_code")
    @ApiModelProperty(value="收货人邮编")
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    @TableField(value = "receiver_province")
    @ApiModelProperty(value="省份/直辖市")
    private String receiverProvince;

    /**
     * 城市
     */
    @TableField(value = "receiver_city")
    @ApiModelProperty(value="城市")
    private String receiverCity;

    /**
     * 区
     */
    @TableField(value = "receiver_region")
    @ApiModelProperty(value="区")
    private String receiverRegion;

    /**
     * 详细地址
     */
    @TableField(value = "receiver_detail_address")
    @ApiModelProperty(value="详细地址")
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    @TableField(value = "note")
    @ApiModelProperty(value="订单备注")
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    @TableField(value = "confirm_status")
    @ApiModelProperty(value="确认收货状态：0->未确认；1->已确认")
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @TableField(value = "delete_status")
    @ApiModelProperty(value="删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    @TableField(value = "use_integration")
    @ApiModelProperty(value="下单时使用的积分")
    private Integer useIntegration;

    /**
     * 支付时间
     */
    @TableField(value = "payment_time")
    @ApiModelProperty(value="支付时间")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @TableField(value = "delivery_time")
    @ApiModelProperty(value="发货时间")
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    @TableField(value = "receive_time")
    @ApiModelProperty(value="确认收货时间")
    private Date receiveTime;

    /**
     * 评价时间
     */
    @TableField(value = "comment_time")
    @ApiModelProperty(value="评价时间")
    private Date commentTime;

    /**
     * 修改时间
     */
    @TableField(value = "modify_time")
    @ApiModelProperty(value="修改时间")
    private Date modifyTime;

    public static final String COL_ID = "id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_COUPON_ID = "coupon_id";

    public static final String COL_ORDER_SN = "order_sn";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_MEMBER_USERNAME = "member_username";

    public static final String COL_TOTAL_AMOUNT = "total_amount";

    public static final String COL_PAY_AMOUNT = "pay_amount";

    public static final String COL_FREIGHT_AMOUNT = "freight_amount";

    public static final String COL_PROMOTION_AMOUNT = "promotion_amount";

    public static final String COL_INTEGRATION_AMOUNT = "integration_amount";

    public static final String COL_COUPON_AMOUNT = "coupon_amount";

    public static final String COL_DISCOUNT_AMOUNT = "discount_amount";

    public static final String COL_PAY_TYPE = "pay_type";

    public static final String COL_SOURCE_TYPE = "source_type";

    public static final String COL_STATUS = "status";

    public static final String COL_ORDER_TYPE = "order_type";

    public static final String COL_DELIVERY_COMPANY = "delivery_company";

    public static final String COL_DELIVERY_SN = "delivery_sn";

    public static final String COL_AUTO_CONFIRM_DAY = "auto_confirm_day";

    public static final String COL_INTEGRATION = "integration";

    public static final String COL_GROWTH = "growth";

    public static final String COL_PROMOTION_INFO = "promotion_info";

    public static final String COL_BILL_TYPE = "bill_type";

    public static final String COL_BILL_HEADER = "bill_header";

    public static final String COL_BILL_CONTENT = "bill_content";

    public static final String COL_BILL_RECEIVER_PHONE = "bill_receiver_phone";

    public static final String COL_BILL_RECEIVER_EMAIL = "bill_receiver_email";

    public static final String COL_RECEIVER_NAME = "receiver_name";

    public static final String COL_RECEIVER_PHONE = "receiver_phone";

    public static final String COL_RECEIVER_POST_CODE = "receiver_post_code";

    public static final String COL_RECEIVER_PROVINCE = "receiver_province";

    public static final String COL_RECEIVER_CITY = "receiver_city";

    public static final String COL_RECEIVER_REGION = "receiver_region";

    public static final String COL_RECEIVER_DETAIL_ADDRESS = "receiver_detail_address";

    public static final String COL_NOTE = "note";

    public static final String COL_CONFIRM_STATUS = "confirm_status";

    public static final String COL_DELETE_STATUS = "delete_status";

    public static final String COL_USE_INTEGRATION = "use_integration";

    public static final String COL_PAYMENT_TIME = "payment_time";

    public static final String COL_DELIVERY_TIME = "delivery_time";

    public static final String COL_RECEIVE_TIME = "receive_time";

    public static final String COL_COMMENT_TIME = "comment_time";

    public static final String COL_MODIFY_TIME = "modify_time";
}
