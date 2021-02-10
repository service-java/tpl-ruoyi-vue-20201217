package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbPermission")
@Data
@TableName(value = "tb_permission")
public class TbPermission {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "permission")
    @ApiModelProperty(value="")
    private String permission;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PERMISSION = "permission";
}