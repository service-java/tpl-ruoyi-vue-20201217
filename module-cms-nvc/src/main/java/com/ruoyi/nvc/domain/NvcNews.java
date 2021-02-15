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
    * 新闻表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcNews")
@Data
@TableName(value = "nvc_news")
public class NvcNews {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 类别ID
     */
    @TableField(value = "cat_id")
    @ApiModelProperty(value="类别ID")
    private Integer catId;

    /**
     * 分类名
     */
    @TableField(value = "cat_name")
    @ApiModelProperty(value="分类名")
    private String catName;

    /**
     * 来源
     */
    @TableField(value = "source_name")
    @ApiModelProperty(value="来源")
    private String sourceName;

    /**
     * 标题
     */
    @TableField(value = "title")
    @ApiModelProperty(value="标题")
    private String title;

    /**
     * 内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="内容")
    private String content;

    /**
     * 发布时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="发布时间")
    private Date createTime;

    /**
     * 发布人ID
     */
    @TableField(value = "create_user_id")
    @ApiModelProperty(value="发布人ID")
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

    public static final String COL_CAT_ID = "cat_id";

    public static final String COL_CAT_NAME = "cat_name";

    public static final String COL_SOURCE_NAME = "source_name";

    public static final String COL_TITLE = "title";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_USER_ID = "create_user_id";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_UPDATE_USER_ID = "update_user_id";
}