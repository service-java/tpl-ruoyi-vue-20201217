package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbPanelContent")
@Data
@TableName(value = "tb_panel_content")
public class TbPanelContent {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 所属板块id
     */
    @TableField(value = "panel_id")
    @ApiModelProperty(value="所属板块id")
    private Integer panelId;

    /**
     * 类型 0关联商品 1其他链接
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="类型 0关联商品 1其他链接")
    private Integer type;

    /**
     * 关联商品id
     */
    @TableField(value = "product_id")
    @ApiModelProperty(value="关联商品id")
    private Long productId;

    @TableField(value = "sort_order")
    @ApiModelProperty(value="")
    private Integer sortOrder;

    /**
     * 其他链接
     */
    @TableField(value = "full_url")
    @ApiModelProperty(value="其他链接")
    private String fullUrl;

    @TableField(value = "pic_url")
    @ApiModelProperty(value="")
    private String picUrl;

    /**
     * 3d轮播图备用
     */
    @TableField(value = "pic_url2")
    @ApiModelProperty(value="3d轮播图备用")
    private String picUrl2;

    /**
     * 3d轮播图备用
     */
    @TableField(value = "pic_url3")
    @ApiModelProperty(value="3d轮播图备用")
    private String picUrl3;

    @TableField(value = "created")
    @ApiModelProperty(value="")
    private Date created;

    @TableField(value = "updated")
    @ApiModelProperty(value="")
    private Date updated;

    public static final String COL_ID = "id";

    public static final String COL_PANEL_ID = "panel_id";

    public static final String COL_TYPE = "type";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_SORT_ORDER = "sort_order";

    public static final String COL_FULL_URL = "full_url";

    public static final String COL_PIC_URL = "pic_url";

    public static final String COL_PIC_URL2 = "pic_url2";

    public static final String COL_PIC_URL3 = "pic_url3";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}