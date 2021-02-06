package com.ruoyi.ums.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
/**
    * 会员积分成长规则表
    */
@ApiModel(value="com-ruoyi-ums-domain-UmsMemberRuleSetting")
@Data
@TableName(value = "ums_member_rule_setting")
public class UmsMemberRuleSetting {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 连续签到天数
     */
    @TableField(value = "continue_sign_day")
    @ApiModelProperty(value="连续签到天数")
    private Integer continueSignDay;

    /**
     * 连续签到赠送数量
     */
    @TableField(value = "continue_sign_point")
    @ApiModelProperty(value="连续签到赠送数量")
    private Integer continueSignPoint;

    /**
     * 每消费多少元获取1个点
     */
    @TableField(value = "consume_per_point")
    @ApiModelProperty(value="每消费多少元获取1个点")
    private BigDecimal consumePerPoint;

    /**
     * 最低获取点数的订单金额
     */
    @TableField(value = "low_order_amount")
    @ApiModelProperty(value="最低获取点数的订单金额")
    private BigDecimal lowOrderAmount;

    /**
     * 每笔订单最高获取点数
     */
    @TableField(value = "max_point_per_order")
    @ApiModelProperty(value="每笔订单最高获取点数")
    private Integer maxPointPerOrder;

    /**
     * 类型：0->积分规则；1->成长值规则
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="类型：0->积分规则；1->成长值规则")
    private Integer type;

    public static final String COL_ID = "id";

    public static final String COL_CONTINUE_SIGN_DAY = "continue_sign_day";

    public static final String COL_CONTINUE_SIGN_POINT = "continue_sign_point";

    public static final String COL_CONSUME_PER_POINT = "consume_per_point";

    public static final String COL_LOW_ORDER_AMOUNT = "low_order_amount";

    public static final String COL_MAX_POINT_PER_ORDER = "max_point_per_order";

    public static final String COL_TYPE = "type";
}
