package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
    * 商品类目
    */
@ApiModel(value="com-ruoyi-tb-domain-TbItemCat")
@Data
@TableName(value = "tb_item_cat")
public class TbItemCat {
    /**
     * 类目ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="类目ID")
    private Long id;

    /**
     * 父分类ID=0时代表一级根分类
     */
    @TableField(value = "parent_id")
    @ApiModelProperty(value="父分类ID=0时代表一级根分类")
    private Long parentId;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="分类名称")
    private String name;

    /**
     * 状态 1启用 0禁用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态 1启用 0禁用")
    private Integer status;

    /**
     * 排列序号
     */
    @TableField(value = "sort_order")
    @ApiModelProperty(value="排列序号")
    private Integer sortOrder;

    /**
     * 是否为父分类 1为true 0为false
     */
    @TableField(value = "is_parent")
    @ApiModelProperty(value="是否为父分类 1为true 0为false")
    private Boolean isParent;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value="备注")
    private String remark;

    /**
     * 创建时间
     */
    @TableField(value = "created")
    @ApiModelProperty(value="创建时间")
    private Date created;

    /**
     * 更新时间
     */
    @TableField(value = "updated")
    @ApiModelProperty(value="更新时间")
    private Date updated;

    public static final String COL_ID = "id";

    public static final String COL_PARENT_ID = "parent_id";

    public static final String COL_NAME = "name";

    public static final String COL_STATUS = "status";

    public static final String COL_SORT_ORDER = "sort_order";

    public static final String COL_IS_PARENT = "is_parent";

    public static final String COL_ICON = "icon";

    public static final String COL_REMARK = "remark";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}