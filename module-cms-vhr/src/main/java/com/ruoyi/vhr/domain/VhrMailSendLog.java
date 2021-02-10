package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrMailSendLog")
@Data
@TableName(value = "vhr_mail_send_log")
public class VhrMailSendLog {
    @TableField(value = "msgId")
    @ApiModelProperty(value = "")
    private String msgid;

    @TableField(value = "empId")
    @ApiModelProperty(value = "")
    private Integer empid;

    /**
     * 0发送中，1发送成功，2发送失败
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "0发送中，1发送成功，2发送失败")
    private Integer status;

    @TableField(value = "routeKey")
    @ApiModelProperty(value = "")
    private String routekey;

    @TableField(value = "exchange")
    @ApiModelProperty(value = "")
    private String exchange;

    /**
     * 重试次数
     */
    @TableField(value = "`count`")
    @ApiModelProperty(value = "重试次数")
    private Integer count;

    /**
     * 第一次重试时间
     */
    @TableField(value = "tryTime")
    @ApiModelProperty(value = "第一次重试时间")
    private Date trytime;

    @TableField(value = "createTime")
    @ApiModelProperty(value = "")
    private Date createtime;

    @TableField(value = "updateTime")
    @ApiModelProperty(value = "")
    private Date updatetime;

    public static final String COL_MSGID = "msgId";

    public static final String COL_EMPID = "empId";

    public static final String COL_STATUS = "status";

    public static final String COL_ROUTEKEY = "routeKey";

    public static final String COL_EXCHANGE = "exchange";

    public static final String COL_COUNT = "count";

    public static final String COL_TRYTIME = "tryTime";

    public static final String COL_CREATETIME = "createTime";

    public static final String COL_UPDATETIME = "updateTime";
}