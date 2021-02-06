package com.ruoyi.oms.domain;

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
 * Date: 2020-12-22 16:28
 */
/**
    * 订单中所包含的商品
    */
@ApiModel(value="com-ruoyi-oms-domain-OmsOrderItem")
@Data
@TableName(value = "oms_order_item")
public class OmsOrderItem {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 订单编号
     */
    @TableField(value = "order_sn")
    @ApiModelProperty(value="订单编号")
    private String orderSn;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "product_pic")
    @ApiModelProperty(value="")
    private String productPic;

    @TableField(value = "product_name")
    @ApiModelProperty(value="")
    private String productName;

    @TableField(value = "product_brand")
    @ApiModelProperty(value="")
    private String productBrand;

    @TableField(value = "product_sn")
    @ApiModelProperty(value="")
    private String productSn;

    /**
     * 销售价格
     */
    @TableField(value = "product_price")
    @ApiModelProperty(value="销售价格")
    private BigDecimal productPrice;

    /**
     * 购买数量
     */
    @TableField(value = "product_quantity")
    @ApiModelProperty(value="购买数量")
    private Integer productQuantity;

    /**
     * 商品sku编号
     */
    @TableField(value = "product_sku_id")
    @ApiModelProperty(value="商品sku编号")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @TableField(value = "product_sku_code")
    @ApiModelProperty(value="商品sku条码")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @TableField(value = "product_category_id")
    @ApiModelProperty(value="商品分类id")
    private Long productCategoryId;

    /**
     * 商品促销名称
     */
    @TableField(value = "promotion_name")
    @ApiModelProperty(value="商品促销名称")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @TableField(value = "promotion_amount")
    @ApiModelProperty(value="商品促销分解金额")
    private BigDecimal promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @TableField(value = "coupon_amount")
    @ApiModelProperty(value="优惠券优惠分解金额")
    private BigDecimal couponAmount;

    /**
     * 积分优惠分解金额
     */
    @TableField(value = "integration_amount")
    @ApiModelProperty(value="积分优惠分解金额")
    private BigDecimal integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @TableField(value = "real_amount")
    @ApiModelProperty(value="该商品经过优惠后的分解金额")
    private BigDecimal realAmount;

    @TableField(value = "gift_integration")
    @ApiModelProperty(value="")
    private Integer giftIntegration;

    @TableField(value = "gift_growth")
    @ApiModelProperty(value="")
    private Integer giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @TableField(value = "product_attr")
    @ApiModelProperty(value="商品销售属性:[{'key':'颜色','value':'颜色'},{'key':'容量','value':'4G'}]")
    private String productAttr;

    public static final String COL_ID = "id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_ORDER_SN = "order_sn";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRODUCT_PIC = "product_pic";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_PRODUCT_BRAND = "product_brand";

    public static final String COL_PRODUCT_SN = "product_sn";

    public static final String COL_PRODUCT_PRICE = "product_price";

    public static final String COL_PRODUCT_QUANTITY = "product_quantity";

    public static final String COL_PRODUCT_SKU_ID = "product_sku_id";

    public static final String COL_PRODUCT_SKU_CODE = "product_sku_code";

    public static final String COL_PRODUCT_CATEGORY_ID = "product_category_id";

    public static final String COL_PROMOTION_NAME = "promotion_name";

    public static final String COL_PROMOTION_AMOUNT = "promotion_amount";

    public static final String COL_COUPON_AMOUNT = "coupon_amount";

    public static final String COL_INTEGRATION_AMOUNT = "integration_amount";

    public static final String COL_REAL_AMOUNT = "real_amount";

    public static final String COL_GIFT_INTEGRATION = "gift_integration";

    public static final String COL_GIFT_GROWTH = "gift_growth";

    public static final String COL_PRODUCT_ATTR = "product_attr";
}
