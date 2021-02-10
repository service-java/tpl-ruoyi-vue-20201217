package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrRole")
@Data
@TableName(value = "vhr_role")
public class VhrRole {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    /**
     * 角色名称
     */
    @TableField(value = "nameZh")
    @ApiModelProperty(value = "角色名称")
    private String namezh;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_NAMEZH = "nameZh";
}