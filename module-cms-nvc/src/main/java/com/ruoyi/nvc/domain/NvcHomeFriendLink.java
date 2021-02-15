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
@ApiModel(value="com-ruoyi-nvc-domain-NvcHomeFriendLink")
@Data
@TableName(value = "nvc_home_friend_link")
public class NvcHomeFriendLink {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 链接名
     */
    @TableField(value = "link_name")
    @ApiModelProperty(value="链接名")
    private String linkName;

    /**
     * 链接url
     */
    @TableField(value = "link_url")
    @ApiModelProperty(value="链接url")
    private String linkUrl;

    /**
     * 排序号
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序号")
    private Byte sort;

    /**
     * 是否开启，0：不开启，1：开启
     */
    @TableField(value = "is_open")
    @ApiModelProperty(value="是否开启，0：不开启，1：开启")
    private Boolean isOpen;

    /**
     * 创建人id
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="创建人id")
    private Long createUserId;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新者用户id
     */
    @TableField(value = "update_user_id")
    @ApiModelProperty(value="更新者用户id")
    private Long updateUserId;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_LINK_NAME = "link_name";

    public static final String COL_LINK_URL = "link_url";

    public static final String COL_SORT = "sort";

    public static final String COL_IS_OPEN = "is_open";

    public static final String COL_CREATE_USER_ID = "create_user_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_USER_ID = "update_user_id";

    public static final String COL_UPDATE_TIME = "update_time";
}