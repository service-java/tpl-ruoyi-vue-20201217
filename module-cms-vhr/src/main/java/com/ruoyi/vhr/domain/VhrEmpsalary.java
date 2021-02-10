package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrEmpsalary")
@Data
@TableName(value = "vhr_empsalary")
public class VhrEmpsalary {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "eid")
    @ApiModelProperty(value = "")
    private Integer eid;

    @TableField(value = "sid")
    @ApiModelProperty(value = "")
    private Integer sid;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_SID = "sid";
}