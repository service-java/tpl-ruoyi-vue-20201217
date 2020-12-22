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
    * 商品属性参数表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductAttribute")
@Data
@TableName(value = "pms_product_attribute")
public class PmsProductAttribute {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_attribute_category_id")
    @ApiModelProperty(value="")
    private Long productAttributeCategoryId;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 属性选择类型：0->唯一；1->单选；2->多选
     */
    @TableField(value = "select_type")
    @ApiModelProperty(value="属性选择类型：0->唯一；1->单选；2->多选")
    private Integer selectType;

    /**
     * 属性录入方式：0->手工录入；1->从列表中选取
     */
    @TableField(value = "input_type")
    @ApiModelProperty(value="属性录入方式：0->手工录入；1->从列表中选取")
    private Integer inputType;

    /**
     * 可选值列表，以逗号隔开
     */
    @TableField(value = "input_list")
    @ApiModelProperty(value="可选值列表，以逗号隔开")
    private String inputList;

    /**
     * 排序字段：最高的可以单独上传图片
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序字段：最高的可以单独上传图片")
    private Integer sort;

    /**
     * 分类筛选样式：1->普通；1->颜色
     */
    @TableField(value = "filter_type")
    @ApiModelProperty(value="分类筛选样式：1->普通；1->颜色")
    private Integer filterType;

    /**
     * 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索
     */
    @TableField(value = "search_type")
    @ApiModelProperty(value="检索类型；0->不需要进行检索；1->关键字检索；2->范围检索")
    private Integer searchType;

    /**
     * 相同属性产品是否关联；0->不关联；1->关联
     */
    @TableField(value = "related_status")
    @ApiModelProperty(value="相同属性产品是否关联；0->不关联；1->关联")
    private Integer relatedStatus;

    /**
     * 是否支持手动新增；0->不支持；1->支持
     */
    @TableField(value = "hand_add_status")
    @ApiModelProperty(value="是否支持手动新增；0->不支持；1->支持")
    private Integer handAddStatus;

    /**
     * 属性的类型；0->规格；1->参数
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="属性的类型；0->规格；1->参数")
    private Integer type;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ATTRIBUTE_CATEGORY_ID = "product_attribute_category_id";

    public static final String COL_NAME = "name";

    public static final String COL_SELECT_TYPE = "select_type";

    public static final String COL_INPUT_TYPE = "input_type";

    public static final String COL_INPUT_LIST = "input_list";

    public static final String COL_SORT = "sort";

    public static final String COL_FILTER_TYPE = "filter_type";

    public static final String COL_SEARCH_TYPE = "search_type";

    public static final String COL_RELATED_STATUS = "related_status";

    public static final String COL_HAND_ADD_STATUS = "hand_add_status";

    public static final String COL_TYPE = "type";
}