package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrPosition")
@Data
@TableName(value = "vhr_position")
public class VhrPosition {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 职位
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "职位")
    private String name;

    @TableField(value = "createDate")
    @ApiModelProperty(value = "")
    private Date createdate;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "")
    private Boolean enabled;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_CREATEDATE = "createDate";

    public static final String COL_ENABLED = "enabled";
}