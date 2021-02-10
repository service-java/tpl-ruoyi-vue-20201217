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

@ApiModel(value="com-ruoyi-tb-domain-TbThanks")
@Data
@TableName(value = "tb_thanks")
public class TbThanks {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "nick_name")
    @ApiModelProperty(value="")
    private String nickName;

    @TableField(value = "username")
    @ApiModelProperty(value="")
    private String username;

    @TableField(value = "money")
    @ApiModelProperty(value="")
    private BigDecimal money;

    @TableField(value = "info")
    @ApiModelProperty(value="")
    private String info;

    /**
     * 通知邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="通知邮箱")
    private String email;

    /**
     * 状态 0待审核 1确认显示  2驳回 3通过不展示
     */
    @TableField(value = "`state`")
    @ApiModelProperty(value="状态 0待审核 1确认显示  2驳回 3通过不展示")
    private Integer state;

    /**
     * 支付方式
     */
    @TableField(value = "pay_type")
    @ApiModelProperty(value="支付方式")
    private String payType;

    /**
     * 关联订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="关联订单id")
    private String orderId;

    @TableField(value = "`date`")
    @ApiModelProperty(value="")
    private Date date;

    public static final String COL_ID = "id";

    public static final String COL_NICK_NAME = "nick_name";

    public static final String COL_USERNAME = "username";

    public static final String COL_MONEY = "money";

    public static final String COL_INFO = "info";

    public static final String COL_EMAIL = "email";

    public static final String COL_STATE = "state";

    public static final String COL_PAY_TYPE = "pay_type";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_DATE = "date";
}