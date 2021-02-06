package com.ruoyi.sms.domain;

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
 * Date: 2020-12-22 16:29
 */
/**
    * 限时购场次表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsFlashPromotionSession")
@Data
@TableName(value = "sms_flash_promotion_session")
public class SmsFlashPromotionSession {
    /**
     * 编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="编号")
    private Long id;

    /**
     * 场次名称
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value="场次名称")
    private String name;

    /**
     * 每日开始时间
     */
    @TableField(value = "start_time")
    @ApiModelProperty(value="每日开始时间")
    private Date startTime;

    /**
     * 每日结束时间
     */
    @TableField(value = "end_time")
    @ApiModelProperty(value="每日结束时间")
    private Date endTime;

    /**
     * 启用状态：0->不启用；1->启用
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="启用状态：0->不启用；1->启用")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";
}
