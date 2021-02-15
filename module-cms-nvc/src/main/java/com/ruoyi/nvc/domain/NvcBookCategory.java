package com.ruoyi.nvc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2021-02-15 15:57
 */
/**
    * 小说类别表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookCategory")
@Data
@TableName(value = "nvc_book_category")
public class NvcBookCategory {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 作品方向，0：男频，1：女频'
     */
    @TableField(value = "work_direction")
    @ApiModelProperty(value="作品方向，0：男频，1：女频'")
    private Boolean workDirection;

    /**
     * 分类名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="分类名")
    private String name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Byte sort;

    @TableField(value = "create_user_id")
    @ApiModelProperty(value="")
    private Long createUserId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "update_user_id")
    @ApiModelProperty(value="")
    private Long updateUserId;

    @TableField(value = "update_time")
    @ApiModelProperty(value="")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_WORK_DIRECTION = "work_direction";

    public static final String COL_NAME = "name";

    public static final String COL_SORT = "sort";

    public static final String COL_CREATE_USER_ID = "create_user_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_USER_ID = "update_user_id";

    public static final String COL_UPDATE_TIME = "update_time";
}