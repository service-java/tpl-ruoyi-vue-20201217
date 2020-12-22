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
    * 产品属性分类表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductAttributeCategory")
@Data
@TableName(value = "pms_product_attribute_category")
public class PmsProductAttributeCategory {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 属性数量
     */
    @TableField(value = "attribute_count")
    @ApiModelProperty(value="属性数量")
    private Integer attributeCount;

    /**
     * 参数数量
     */
    @TableField(value = "param_count")
    @ApiModelProperty(value="参数数量")
    private Integer paramCount;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_ATTRIBUTE_COUNT = "attribute_count";

    public static final String COL_PARAM_COUNT = "param_count";
}