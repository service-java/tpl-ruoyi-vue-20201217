package com.ruoyi.sms.domain;

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
 * Date: 2020-12-22 16:29
 */
/**
    * 优惠券表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsCoupon")
@Data
@TableName(value = "sms_coupon")
public class SmsCoupon {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="优惠券类型；0->全场赠券；1->会员赠券；2->购物赠券；3->注册赠券")
    private Integer type;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 使用平台：0->全部；1->移动；2->PC
     */
    @TableField(value = "platform")
    @ApiModelProperty(value="使用平台：0->全部；1->移动；2->PC")
    private Integer platform;

    /**
     * 数量
     */
    @TableField(value = "`count`")
    @ApiModelProperty(value="数量")
    private Integer count;

    /**
     * 金额
     */
    @TableField(value = "amount")
    @ApiModelProperty(value="金额")
    private BigDecimal amount;

    /**
     * 每人限领张数
     */
    @TableField(value = "per_limit")
    @ApiModelProperty(value="每人限领张数")
    private Integer perLimit;

    /**
     * 使用门槛；0表示无门槛
     */
    @TableField(value = "min_point")
    @ApiModelProperty(value="使用门槛；0表示无门槛")
    private BigDecimal minPoint;

    @TableField(value = "start_time")
    @ApiModelProperty(value="")
    private Date startTime;

    @TableField(value = "end_time")
    @ApiModelProperty(value="")
    private Date endTime;

    /**
     * 使用类型：0->全场通用；1->指定分类；2->指定商品
     */
    @TableField(value = "use_type")
    @ApiModelProperty(value="使用类型：0->全场通用；1->指定分类；2->指定商品")
    private Integer useType;

    /**
     * 备注
     */
    @TableField(value = "note")
    @ApiModelProperty(value="备注")
    private String note;

    /**
     * 发行数量
     */
    @TableField(value = "publish_count")
    @ApiModelProperty(value="发行数量")
    private Integer publishCount;

    /**
     * 已使用数量
     */
    @TableField(value = "use_count")
    @ApiModelProperty(value="已使用数量")
    private Integer useCount;

    /**
     * 领取数量
     */
    @TableField(value = "receive_count")
    @ApiModelProperty(value="领取数量")
    private Integer receiveCount;

    /**
     * 可以领取的日期
     */
    @TableField(value = "enable_time")
    @ApiModelProperty(value="可以领取的日期")
    private Date enableTime;

    /**
     * 优惠码
     */
    @TableField(value = "code")
    @ApiModelProperty(value="优惠码")
    private String code;

    /**
     * 可领取的会员类型：0->无限时
     */
    @TableField(value = "member_level")
    @ApiModelProperty(value="可领取的会员类型：0->无限时")
    private Integer memberLevel;

    public static final String COL_ID = "id";

    public static final String COL_TYPE = "type";

    public static final String COL_NAME = "name";

    public static final String COL_PLATFORM = "platform";

    public static final String COL_COUNT = "count";

    public static final String COL_AMOUNT = "amount";

    public static final String COL_PER_LIMIT = "per_limit";

    public static final String COL_MIN_POINT = "min_point";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_USE_TYPE = "use_type";

    public static final String COL_NOTE = "note";

    public static final String COL_PUBLISH_COUNT = "publish_count";

    public static final String COL_USE_COUNT = "use_count";

    public static final String COL_RECEIVE_COUNT = "receive_count";

    public static final String COL_ENABLE_TIME = "enable_time";

    public static final String COL_CODE = "code";

    public static final String COL_MEMBER_LEVEL = "member_level";
}
