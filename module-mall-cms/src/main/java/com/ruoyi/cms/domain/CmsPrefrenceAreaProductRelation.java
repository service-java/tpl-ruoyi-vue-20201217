package com.ruoyi.cms.domain;

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
 * Date: 2020-12-22 16:14
 */

/**
 * 优选专区和产品关系表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsPrefrenceAreaProductRelation")
@Data
@TableName(value = "cms_prefrence_area_product_relation")
public class CmsPrefrenceAreaProductRelation {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "prefrence_area_id")
    @ApiModelProperty(value = "")
    private Long prefrenceAreaId;

    @TableField(value = "product_id")
    @ApiModelProperty(value = "")
    private Long productId;

    public static final String COL_ID = "id";

    public static final String COL_PREFRENCE_AREA_ID = "prefrence_area_id";

    public static final String COL_PRODUCT_ID = "product_id";
}