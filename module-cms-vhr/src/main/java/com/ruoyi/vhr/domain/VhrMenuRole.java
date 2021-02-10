package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrMenuRole")
@Data
@TableName(value = "vhr_menu_role")
public class VhrMenuRole {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "mid")
    @ApiModelProperty(value = "")
    private Integer mid;

    @TableField(value = "rid")
    @ApiModelProperty(value = "")
    private Integer rid;

    public static final String COL_ID = "id";

    public static final String COL_MID = "mid";

    public static final String COL_RID = "rid";
}