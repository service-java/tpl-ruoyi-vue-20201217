package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 商品表
    */
@ApiModel(value="com-ruoyi-tb-domain-TbItem")
@Data
@TableName(value = "tb_item")
public class TbItem {
    /**
     * 商品id，同时也是商品编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="商品id，同时也是商品编号")
    private Long id;

    /**
     * 商品标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="商品标题")
    private String title;

    /**
     * 商品卖点
     */
    @TableField(value = "sell_point")
    @ApiModelProperty(value="商品卖点")
    private String sellPoint;

    /**
     * 商品价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value="商品价格")
    private BigDecimal price;

    /**
     * 库存数量
     */
    @TableField(value = "num")
    @ApiModelProperty(value="库存数量")
    private Integer num;

    /**
     * 售卖数量限制
     */
    @TableField(value = "limit_num")
    @ApiModelProperty(value="售卖数量限制")
    private Integer limitNum;

    /**
     * 商品图片
     */
    @TableField(value = "image")
    @ApiModelProperty(value="商品图片")
    private String image;

    /**
     * 所属分类
     */
    @TableField(value = "cid")
    @ApiModelProperty(value="所属分类")
    private Long cid;

    /**
     * 商品状态 1正常 0下架
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="商品状态 1正常 0下架")
    private Integer status;

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

    public static final String COL_TITLE = "title";

    public static final String COL_SELL_POINT = "sell_point";

    public static final String COL_PRICE = "price";

    public static final String COL_NUM = "num";

    public static final String COL_LIMIT_NUM = "limit_num";

    public static final String COL_IMAGE = "image";

    public static final String COL_CID = "cid";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}