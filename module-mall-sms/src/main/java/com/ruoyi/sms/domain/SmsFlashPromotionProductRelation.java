package com.ruoyi.sms.domain;

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
 * Date: 2020-12-22 16:29
 */
/**
    * 商品限时购与商品关系表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsFlashPromotionProductRelation")
@Data
@TableName(value = "sms_flash_promotion_product_relation")
public class SmsFlashPromotionProductRelation {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="编号")
    private Long id;

    @TableField(value = "flash_promotion_id")
    @ApiModelProperty(value="")
    private Long flashPromotionId;

    /**
     * 编号
     */
    @TableField(value = "flash_promotion_session_id")
    @ApiModelProperty(value="编号")
    private Long flashPromotionSessionId;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    /**
     * 限时购价格
     */
    @TableField(value = "flash_promotion_price")
    @ApiModelProperty(value="限时购价格")
    private BigDecimal flashPromotionPrice;

    /**
     * 限时购数量
     */
    @TableField(value = "flash_promotion_count")
    @ApiModelProperty(value="限时购数量")
    private Integer flashPromotionCount;

    /**
     * 每人限购数量
     */
    @TableField(value = "flash_promotion_limit")
    @ApiModelProperty(value="每人限购数量")
    private Integer flashPromotionLimit;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_FLASH_PROMOTION_ID = "flash_promotion_id";

    public static final String COL_FLASH_PROMOTION_SESSION_ID = "flash_promotion_session_id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_FLASH_PROMOTION_PRICE = "flash_promotion_price";

    public static final String COL_FLASH_PROMOTION_COUNT = "flash_promotion_count";

    public static final String COL_FLASH_PROMOTION_LIMIT = "flash_promotion_limit";

    public static final String COL_SORT = "sort";
}
