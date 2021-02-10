package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrJoblevel")
@Data
@TableName(value = "vhr_joblevel")
public class VhrJoblevel {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 职称名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "职称名称")
    private String name;

    @TableField(value = "titleLevel")
    @ApiModelProperty(value = "")
    private Object titlelevel;

    @TableField(value = "createDate")
    @ApiModelProperty(value = "")
    private Date createdate;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "")
    private Boolean enabled;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TITLELEVEL = "titleLevel";

    public static final String COL_CREATEDATE = "createDate";

    public static final String COL_ENABLED = "enabled";
}