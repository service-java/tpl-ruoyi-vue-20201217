package com.ruoyi.pms.domain;

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
 * Date: 2020-12-22 16:32
 */
/**
    * 存储产品参数信息的表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductAttributeValue")
@Data
@TableName(value = "pms_product_attribute_value")
public class PmsProductAttributeValue {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "product_attribute_id")
    @ApiModelProperty(value="")
    private Long productAttributeId;

    /**
     * 手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开
     */
    @TableField(value = "`value`")
    @ApiModelProperty(value="手动添加规格或参数的值，参数单值，规格有多个时以逗号隔开")
    private String value;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_PRODUCT_ATTRIBUTE_ID = "product_attribute_id";

    public static final String COL_VALUE = "value";
}