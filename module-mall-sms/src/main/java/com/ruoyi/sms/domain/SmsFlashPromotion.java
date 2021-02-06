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
    * 限时购表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsFlashPromotion")
@Data
@TableName(value = "sms_flash_promotion")
public class SmsFlashPromotion {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "title")
    @ApiModelProperty(value="")
    private String title;

    /**
     * 开始日期
     */
    @TableField(value = "start_date")
    @ApiModelProperty(value="开始日期")
    private Date startDate;

    /**
     * 结束日期
     */
    @TableField(value = "end_date")
    @ApiModelProperty(value="结束日期")
    private Date endDate;

    /**
     * 上下线状态
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="上下线状态")
    private Integer status;

    /**
     * 秒杀时间段名称
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="秒杀时间段名称")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_START_DATE = "start_date";

    public static final String COL_END_DATE = "end_date";

    public static final String COL_STATUS = "status";

    public static final String COL_CREATE_TIME = "create_time";
}
