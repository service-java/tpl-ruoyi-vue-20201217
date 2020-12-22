package com.ruoyi.sms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
/**
    * 优惠券和产品的关系表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsCouponProductRelation")
@Data
@TableName(value = "sms_coupon_product_relation")
public class SmsCouponProductRelation {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "coupon_id")
    @ApiModelProperty(value="")
    private Long couponId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 商品名称
     */
    @TableField(value = "product_name")
    @ApiModelProperty(value="商品名称")
    private String productName;

    /**
     * 商品编码
     */
    @TableField(value = "product_sn")
    @ApiModelProperty(value="商品编码")
    private String productSn;

    public static final String COL_ID = "id";

    public static final String COL_COUPON_ID = "coupon_id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRODUCT_NAME = "product_name";

    public static final String COL_PRODUCT_SN = "product_sn";
}