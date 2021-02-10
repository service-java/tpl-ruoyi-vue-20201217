package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrDepartment")
@Data
@TableName(value = "vhr_department")
public class VhrDepartment {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 部门名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "部门名称")
    private String name;

    @TableField(value = "parentId")
    @ApiModelProperty(value = "")
    private Integer parentid;

    @TableField(value = "depPath")
    @ApiModelProperty(value = "")
    private String deppath;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "")
    private Boolean enabled;

    @TableField(value = "isParent")
    @ApiModelProperty(value = "")
    private Boolean isparent;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_PARENTID = "parentId";

    public static final String COL_DEPPATH = "depPath";

    public static final String COL_ENABLED = "enabled";

    public static final String COL_ISPARENT = "isParent";
}