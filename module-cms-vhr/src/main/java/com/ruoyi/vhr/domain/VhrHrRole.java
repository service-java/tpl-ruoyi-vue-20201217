package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrHrRole")
@Data
@TableName(value = "vhr_hr_role")
public class VhrHrRole {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "hrid")
    @ApiModelProperty(value = "")
    private Integer hrid;

    @TableField(value = "rid")
    @ApiModelProperty(value = "")
    private Integer rid;

    public static final String COL_ID = "id";

    public static final String COL_HRID = "hrid";

    public static final String COL_RID = "rid";
}