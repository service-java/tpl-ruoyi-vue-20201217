package com.ruoyi.ums.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
/**
    * 后台用户权限表
    */
@ApiModel(value="com-ruoyi-ums-domain-UmsPermission")
@Data
@TableName(value = "ums_permission")
public class UmsPermission {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 父级权限id
     */
    @TableField(value = "pid")
    @ApiModelProperty(value="父级权限id")
    private Long pid;

    /**
     * 名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="名称")
    private String name;

    /**
     * 权限值
     */
    @TableField(value = "`value`")
    @ApiModelProperty(value="权限值")
    private String value;

    /**
     * 图标
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="图标")
    private String icon;

    /**
     * 权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="权限类型：0->目录；1->菜单；2->按钮（接口绑定权限）")
    private Integer type;

    /**
     * 前端资源路径
     */
    @TableField(value = "uri")
    @ApiModelProperty(value="前端资源路径")
    private String uri;

    /**
     * 启用状态；0->禁用；1->启用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="启用状态；0->禁用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_PID = "pid";

    public static final String COL_NAME = "name";

    public static final String COL_VALUE = "value";

    public static final String COL_ICON = "icon";

    public static final String COL_TYPE = "type";

    public static final String COL_URI = "uri";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_SORT = "sort";
}
