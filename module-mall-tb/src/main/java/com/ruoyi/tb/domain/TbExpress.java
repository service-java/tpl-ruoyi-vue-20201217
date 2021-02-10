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
    * 商品描述表
    */
@ApiModel(value="com-ruoyi-tb-domain-TbExpress")
@Data
@TableName(value = "tb_express")
public class TbExpress {
    /**
     * 快递ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="快递ID")
    private Integer id;

    /**
     * 商品描述
     */
    @TableField(value = "express_name")
    @ApiModelProperty(value="商品描述")
    private String expressName;

    /**
     * 排序
     */
    @TableField(value = "sort_order")
    @ApiModelProperty(value="排序")
    private Integer sortOrder;

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

    public static final String COL_EXPRESS_NAME = "express_name";

    public static final String COL_SORT_ORDER = "sort_order";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}