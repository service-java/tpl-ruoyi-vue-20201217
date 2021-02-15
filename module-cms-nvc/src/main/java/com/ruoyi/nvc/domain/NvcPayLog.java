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
    * 充值记录
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcPayLog")
@Data
@TableName(value = "nvc_pay_log")
public class NvcPayLog {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 商户订单号
     */
    @TableField(value = "out_trade_no")
    @ApiModelProperty(value="商户订单号")
    private Long outTradeNo;

    /**
     * 交易类型，0:充值购买屋币，1:包年VIP
     */
    @TableField(value = "trade_type")
    @ApiModelProperty(value="交易类型，0:充值购买屋币，1:包年VIP")
    private Boolean tradeType;

    /**
     * 支付宝/微信交易号
     */
    @TableField(value = "trade_no")
    @ApiModelProperty(value="支付宝/微信交易号")
    private String tradeNo;

    /**
     * 支付渠道，1：支付宝，2：微信
     */
    @TableField(value = "pay_channel")
    @ApiModelProperty(value="支付渠道，1：支付宝，2：微信")
    private Boolean payChannel;

    /**
     * 交易金额(单位分)
     */
    @TableField(value = "total_amount")
    @ApiModelProperty(value="交易金额(单位分)")
    private Integer totalAmount;

    /**
     * 支付用户ID
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="支付用户ID")
    private Long userId;

    /**
     * 支付状态
     */
    @TableField(value = "pay_status")
    @ApiModelProperty(value="支付状态")
    private String payStatus;

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

    public static final String COL_OUT_TRADE_NO = "out_trade_no";

    public static final String COL_TRADE_TYPE = "trade_type";

    public static final String COL_TRADE_NO = "trade_no";

    public static final String COL_PAY_CHANNEL = "pay_channel";

    public static final String COL_TOTAL_AMOUNT = "total_amount";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_PAY_STATUS = "pay_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}