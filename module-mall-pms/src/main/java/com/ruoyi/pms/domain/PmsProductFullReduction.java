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
    * 产品满减表(只针对同商品)
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductFullReduction")
@Data
@TableName(value = "pms_product_full_reduction")
public class PmsProductFullReduction {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "full_price")
    @ApiModelProperty(value="")
    private BigDecimal fullPrice;

    @TableField(value = "reduce_price")
    @ApiModelProperty(value="")
    private BigDecimal reducePrice;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_FULL_PRICE = "full_price";

    public static final String COL_REDUCE_PRICE = "reduce_price";
}
