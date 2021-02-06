package com.ruoyi.pms.domain;

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
 * Date: 2020-12-22 16:32
 */
/**
    * 产品阶梯价格表(只针对同商品)
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductLadder")
@Data
@TableName(value = "pms_product_ladder")
public class PmsProductLadder {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 满足的商品数量
     */
    @TableField(value = "`count`")
    @ApiModelProperty(value="满足的商品数量")
    private Integer count;

    /**
     * 折扣
     */
    @TableField(value = "discount")
    @ApiModelProperty(value="折扣")
    private BigDecimal discount;

    /**
     * 折后价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value="折后价格")
    private BigDecimal price;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_COUNT = "count";

    public static final String COL_DISCOUNT = "discount";

    public static final String COL_PRICE = "price";
}
