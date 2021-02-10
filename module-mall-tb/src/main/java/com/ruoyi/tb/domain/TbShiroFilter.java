package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbShiroFilter")
@Data
@TableName(value = "tb_shiro_filter")
public class TbShiroFilter {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "perms")
    @ApiModelProperty(value="")
    private String perms;

    @TableField(value = "sort_order")
    @ApiModelProperty(value="")
    private Integer sortOrder;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PERMS = "perms";

    public static final String COL_SORT_ORDER = "sort_order";
}