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
    * 首页小说设置表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcHomeBook")
@Data
@TableName(value = "nvc_home_book")
public class NvcHomeBook {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    @ApiModelProperty(value="小说ID")
    private Long bookId;

    /**
     * 排序号
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序号")
    private Byte sort;

    /**
     * 类型，0：轮播图，1：顶部小说栏设置，2：本周强推，3：热门推荐，4：精品推荐
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="类型，0：轮播图，1：顶部小说栏设置，2：本周强推，3：热门推荐，4：精品推荐")
    private Boolean type;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 创建人ID
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="创建人ID")
    private Long createUserId;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 更新人ID
     */
    @TableField(value = "update_user_id")
    @ApiModelProperty(value="更新人ID")
    private Long updateUserId;

    public static final String COL_ID = "id";

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_SORT = "sort";

    public static final String COL_TYPE = "type";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER_ID = "create_user_id";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_UPDATE_USER_ID = "update_user_id";
}