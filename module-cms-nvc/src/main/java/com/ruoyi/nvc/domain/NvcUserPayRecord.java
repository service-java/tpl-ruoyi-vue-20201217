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
    * 用户充值记录表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcUserPayRecord")
@Data
@TableName(value = "nvc_user_pay_record")
public class NvcUserPayRecord {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 充值用户ID
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="充值用户ID")
    private Long userId;

    /**
     * 充值方式，1：支付宝，2：微信
     */
    @TableField(value = "pay_channel")
    @ApiModelProperty(value="充值方式，1：支付宝，2：微信")
    private Boolean payChannel;

    /**
     * 商户订单号
     */
    @TableField(value = "out_trade_no")
    @ApiModelProperty(value="商户订单号")
    private Long outTradeNo;

    /**
     * 充值金额(单位元)
     */
    @TableField(value = "total_amount")
    @ApiModelProperty(value="充值金额(单位元)")
    private Integer totalAmount;

    /**
     * 获得屋币
     */
    @TableField(value = "wu_amount")
    @ApiModelProperty(value="获得屋币")
    private Integer wuAmount;

    /**
     * 充值时间
     */
    @TableField(value = "pay_time")
    @ApiModelProperty(value="充值时间")
    private Date payTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_PAY_CHANNEL = "pay_channel";

    public static final String COL_OUT_TRADE_NO = "out_trade_no";

    public static final String COL_TOTAL_AMOUNT = "total_amount";

    public static final String COL_WU_AMOUNT = "wu_amount";

    public static final String COL_PAY_TIME = "pay_time";
}