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
    * 产品分类
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductCategory")
@Data
@TableName(value = "pms_product_category")
public class PmsProductCategory {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 上机分类的编号：0表示一级分类
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="上机分类的编号：0表示一级分类")
    private Long parentId;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 分类级别：0->1级；1->2级
     */
    @TableField(value = "`level`")
    @ApiModelProperty(value="分类级别：0->1级；1->2级")
    private Integer level;

    @TableField(value = "product_count")
    @ApiModelProperty(value="")
    private Integer productCount;

    @TableField(value = "product_unit")
    @ApiModelProperty(value="")
    private String productUnit;

    /**
     * 是否显示在导航栏：0->不显示；1->显示
     */
    @TableField(value = "nav_status")
    @ApiModelProperty(value="是否显示在导航栏：0->不显示；1->显示")
    private Integer navStatus;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @TableField(value = "show_status")
    @ApiModelProperty(value="显示状态：0->不显示；1->显示")
    private Integer showStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    @TableField(value = "keywords")
    @ApiModelProperty(value="")
    private String keywords;

    /**
     * 描述
     */
    @TableField(value = "description")
    @ApiModelProperty(value="描述")
    private String description;

    public static final String COL_ID = "id";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_NAME = "name";

    public static final String COL_LEVEL = "level";

    public static final String COL_PRODUCT_COUNT = "product_count";

    public static final String COL_PRODUCT_UNIT = "product_unit";

    public static final String COL_NAV_STATUS = "nav_status";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_SORT = "sort";

    public static final String COL_ICON = "icon";

    public static final String COL_KEYWORDS = "keywords";

    public static final String COL_DESCRIPTION = "description";
}