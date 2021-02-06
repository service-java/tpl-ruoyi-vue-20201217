package com.ruoyi.sms.domain;

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
 * Date: 2020-12-22 16:29
 */
/**
    * 优惠券使用、领取历史表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsCouponHistory")
@Data
@TableName(value = "sms_coupon_history")
public class SmsCouponHistory {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    @TableField(value = "member_id")
    @ApiModelProperty(value="")
    private Long memberId;

    @TableField(value = "coupon_code")
    @ApiModelProperty(value="")
    private String couponCode;

    /**
     * 领取人昵称
     */
    @TableField(value = "member_nickname")
    @ApiModelProperty(value="领取人昵称")
    private String memberNickname;

    /**
     * 获取类型：0->后台赠送；1->主动获取
     */
    @TableField(value = "get_type")
    @ApiModelProperty(value="获取类型：0->后台赠送；1->主动获取")
    private Integer getType;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 使用状态：0->未使用；1->已使用；2->已过期
     */
    @TableField(value = "use_status")
    @ApiModelProperty(value="使用状态：0->未使用；1->已使用；2->已过期")
    private Integer useStatus;

    /**
     * 使用时间
     */
    @TableField(value = "use_time")
    @ApiModelProperty(value="使用时间")
    private Date useTime;

    /**
     * 订单编号
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单编号")
    private Long orderId;

    /**
     * 订单号码
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value="订单号码")
    private String orderSn;

    public static final String COL_ID = "id";

    public static final String COL_COUPON_ID = "coupon_id";

    public static final String COL_MEMBER_ID = "member_id";

    public static final String COL_COUPON_CODE = "coupon_code";

    public static final String COL_MEMBER_NICKNAME = "member_nickname";

    public static final String COL_GET_TYPE = "get_type";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_USE_STATUS = "use_status";

    public static final String COL_USE_TIME = "use_time";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_ORDER_SN = "order_sn";
}
