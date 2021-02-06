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
    * 商品会员价格表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsMemberPrice")
@Data
@TableName(value = "pms_member_price")
public class PmsMemberPrice {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "member_level_id")
    @ApiModelProperty(value="")
    private Long memberLevelId;

    /**
     * 会员价格
     */
    @TableField(value = "member_price")
    @ApiModelProperty(value="会员价格")
    private BigDecimal memberPrice;

    @TableField(value = "member_level_name")
    @ApiModelProperty(value="")
    private String memberLevelName;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_MEMBER_LEVEL_ID = "member_level_id";

    public static final String COL_MEMBER_PRICE = "member_price";

    public static final String COL_MEMBER_LEVEL_NAME = "member_level_name";
}
