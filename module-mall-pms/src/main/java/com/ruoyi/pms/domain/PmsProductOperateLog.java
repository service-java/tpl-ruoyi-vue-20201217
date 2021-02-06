package com.ruoyi.pms.domain;

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
 * Date: 2020-12-22 16:32
 */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductOperateLog")
@Data
@TableName(value = "pms_product_operate_log")
public class PmsProductOperateLog {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "price_old")
    @ApiModelProperty(value="")
    private BigDecimal priceOld;

    @TableField(value = "price_new")
    @ApiModelProperty(value="")
    private BigDecimal priceNew;

    @TableField(value = "sale_price_old")
    @ApiModelProperty(value="")
    private BigDecimal salePriceOld;

    @TableField(value = "sale_price_new")
    @ApiModelProperty(value="")
    private BigDecimal salePriceNew;

    /**
     * 赠送的积分
     */
    @TableField(value = "gift_point_old")
    @ApiModelProperty(value="赠送的积分")
    private Integer giftPointOld;

    @TableField(value = "gift_point_new")
    @ApiModelProperty(value="")
    private Integer giftPointNew;

    @TableField(value = "use_point_limit_old")
    @ApiModelProperty(value="")
    private Integer usePointLimitOld;

    @TableField(value = "use_point_limit_new")
    @ApiModelProperty(value="")
    private Integer usePointLimitNew;

    /**
     * 操作人
     */
    @TableField(value = "operate_man")
    @ApiModelProperty(value="操作人")
    private String operateMan;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRICE_OLD = "price_old";

    public static final String COL_PRICE_NEW = "price_new";

    public static final String COL_SALE_PRICE_OLD = "sale_price_old";

    public static final String COL_SALE_PRICE_NEW = "sale_price_new";

    public static final String COL_GIFT_POINT_OLD = "gift_point_old";

    public static final String COL_GIFT_POINT_NEW = "gift_point_new";

    public static final String COL_USE_POINT_LIMIT_OLD = "use_point_limit_old";

    public static final String COL_USE_POINT_LIMIT_NEW = "use_point_limit_new";

    public static final String COL_OPERATE_MAN = "operate_man";

    public static final String COL_CREATE_TIME = "create_time";
}
