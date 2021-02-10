package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrMenu")
@Data
@TableName(value = "vhr_menu")
public class VhrMenu {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "url")
    @ApiModelProperty(value = "")
    private String url;

    @TableField(value = "`path`")
    @ApiModelProperty(value = "")
    private String path;

    @TableField(value = "component")
    @ApiModelProperty(value = "")
    private String component;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "iconCls")
    @ApiModelProperty(value = "")
    private String iconcls;

    @TableField(value = "keepAlive")
    @ApiModelProperty(value = "")
    private Boolean keepalive;

    @TableField(value = "requireAuth")
    @ApiModelProperty(value = "")
    private Boolean requireauth;

    @TableField(value = "parentId")
    @ApiModelProperty(value = "")
    private Integer parentid;

    @TableField(value = "enabled")
    @ApiModelProperty(value = "")
    private Boolean enabled;

    public static final String COL_ID = "id";

    public static final String COL_URL = "url";

    public static final String COL_PATH = "path";

    public static final String COL_COMPONENT = "component";

    public static final String COL_NAME = "name";

    public static final String COL_ICONCLS = "iconCls";

    public static final String COL_KEEPALIVE = "keepAlive";

    public static final String COL_REQUIREAUTH = "requireAuth";

    public static final String COL_PARENTID = "parentId";

    public static final String COL_ENABLED = "enabled";
}