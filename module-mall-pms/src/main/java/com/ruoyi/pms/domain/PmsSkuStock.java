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
    * sku的库存
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsSkuStock")
@Data
@TableName(value = "pms_sku_stock")
public class PmsSkuStock {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * sku编码
     */
    @TableField(value = "sku_code")
    @ApiModelProperty(value="sku编码")
    private String skuCode;

    @TableField(value = "price")
    @ApiModelProperty(value="")
    private BigDecimal price;

    /**
     * 库存
     */
    @TableField(value = "stock")
    @ApiModelProperty(value="库存")
    private Integer stock;

    /**
     * 预警库存
     */
    @TableField(value = "low_stock")
    @ApiModelProperty(value="预警库存")
    private Integer lowStock;

    /**
     * 展示图片
     */
    @TableField(value = "pic")
    @ApiModelProperty(value="展示图片")
    private String pic;

    /**
     * 销量
     */
    @TableField(value = "sale")
    @ApiModelProperty(value="销量")
    private Integer sale;

    /**
     * 单品促销价格
     */
    @TableField(value = "promotion_price")
    @ApiModelProperty(value="单品促销价格")
    private BigDecimal promotionPrice;

    /**
     * 锁定库存
     */
    @TableField(value = "lock_stock")
    @ApiModelProperty(value="锁定库存")
    private Integer lockStock;

    /**
     * 商品销售属性，json格式
     */
    @TableField(value = "sp_data")
    @ApiModelProperty(value="商品销售属性，json格式")
    private String spData;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_SKU_CODE = "sku_code";

    public static final String COL_PRICE = "price";

    public static final String COL_STOCK = "stock";

    public static final String COL_LOW_STOCK = "low_stock";

    public static final String COL_PIC = "pic";

    public static final String COL_SALE = "sale";

    public static final String COL_PROMOTION_PRICE = "promotion_price";

    public static final String COL_LOCK_STOCK = "lock_stock";

    public static final String COL_SP_DATA = "sp_data";
}
