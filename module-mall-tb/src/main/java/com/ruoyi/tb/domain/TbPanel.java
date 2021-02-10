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
    * 内容分类
    */
@ApiModel(value="com-ruoyi-tb-domain-TbPanel")
@Data
@TableName(value = "tb_panel")
public class TbPanel {
    /**
     * 类目ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="类目ID")
    private Integer id;

    /**
     * 板块名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="板块名称")
    private String name;

    /**
     * 类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="类型 0轮播图 1板块种类一 2板块种类二 3板块种类三 ")
    private Integer type;

    /**
     * 排列序号
     */
    @TableField(value = "sort_order")
    @ApiModelProperty(value="排列序号")
    private Integer sortOrder;

    /**
     * 所属位置 0首页 1商品推荐 2我要捐赠
     */
    @TableField(value = "`position`")
    @ApiModelProperty(value="所属位置 0首页 1商品推荐 2我要捐赠")
    private Integer position;

    /**
     * 板块限制商品数量
     */
    @TableField(value = "limit_num")
    @ApiModelProperty(value="板块限制商品数量")
    private Integer limitNum;

    /**
     * 状态
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态")
    private Integer status;

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

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_SORT_ORDER = "sort_order";

    public static final String COL_POSITION = "position";

    public static final String COL_LIMIT_NUM = "limit_num";

    public static final String COL_STATUS = "status";

    public static final String COL_REMARK = "remark";

    public static final String COL_CREATED = "created";

    public static final String COL_UPDATED = "updated";
}