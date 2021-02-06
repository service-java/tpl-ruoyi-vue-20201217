package com.ruoyi.cms.domain;

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
 * Date: 2020-12-22 16:14
 */

/**
 * 话题表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsTopic")
@Data
@TableName(value = "cms_topic")
public class CmsTopic {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    @TableField(value = "category_id")
    @ApiModelProperty(value = "")
    private Long categoryId;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "start_time")
    @ApiModelProperty(value = "")
    private Date startTime;

    @TableField(value = "end_time")
    @ApiModelProperty(value = "")
    private Date endTime;

    /**
     * 参与人数
     */
    @TableField(value = "attend_count")
    @ApiModelProperty(value = "参与人数")
    private Integer attendCount;

    /**
     * 关注人数
     */
    @TableField(value = "attention_count")
    @ApiModelProperty(value = "关注人数")
    private Integer attentionCount;

    @TableField(value = "read_count")
    @ApiModelProperty(value = "")
    private Integer readCount;

    /**
     * 奖品名称
     */
    @TableField(value = "award_name")
    @ApiModelProperty(value = "奖品名称")
    private String awardName;

    /**
     * 参与方式
     */
    @TableField(value = "attend_type")
    @ApiModelProperty(value = "参与方式")
    private String attendType;

    /**
     * 话题内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value = "话题内容")
    private String content;

    public static final String COL_ID = "id";

    public static final String COL_CATEGORY_ID = "category_id";

    public static final String COL_NAME = "name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_ATTEND_COUNT = "attend_count";

    public static final String COL_ATTENTION_COUNT = "attention_count";

    public static final String COL_READ_COUNT = "read_count";

    public static final String COL_AWARD_NAME = "award_name";

    public static final String COL_ATTEND_TYPE = "attend_type";

    public static final String COL_CONTENT = "content";
}
