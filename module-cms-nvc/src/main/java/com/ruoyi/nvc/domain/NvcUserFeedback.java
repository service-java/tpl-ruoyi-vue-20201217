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
@ApiModel(value="com-ruoyi-nvc-domain-NvcUserFeedback")
@Data
@TableName(value = "nvc_user_feedback")
public class NvcUserFeedback {
    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键id")
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户id")
    private Long userId;

    /**
     * 反馈内容
     */
    @TableField(value = "content")
    @ApiModelProperty(value="反馈内容")
    private String content;

    /**
     * 反馈时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="反馈时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_CONTENT = "content";

    public static final String COL_CREATE_TIME = "create_time";
}