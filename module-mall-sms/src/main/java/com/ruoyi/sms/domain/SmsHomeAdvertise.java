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
    * 首页轮播广告表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsHomeAdvertise")
@Data
@TableName(value = "sms_home_advertise")
public class SmsHomeAdvertise {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 轮播位置：0->PC首页轮播；1->app首页轮播
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    @TableField(value = "pic")
    @ApiModelProperty(value="")
    private String pic;

    @TableField(value = "start_time")
    @ApiModelProperty(value="")
    private Date startTime;

    @TableField(value = "end_time")
    @ApiModelProperty(value="")
    private Date endTime;

    /**
     * 上下线状态：0->下线；1->上线
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="上下线状态：0->下线；1->上线")
    private Integer status;

    /**
     * 点击数
     */
    @TableField(value = "click_count")
    @ApiModelProperty(value="点击数")
    private Integer clickCount;

    /**
     * 下单数
     */
    @TableField(value = "order_count")
    @ApiModelProperty(value="下单数")
    private Integer orderCount;

    /**
     * 链接地址
     */
    @TableField(value = "url")
    @ApiModelProperty(value="链接地址")
    private String url;

    /**
     * 备注
     */
    @TableField(value = "note")
    @ApiModelProperty(value="备注")
    private String note;

    /**
     * 排序
     */
    @TableField(value = "sort")
    @ApiModelProperty(value="排序")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_PIC = "pic";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_STATUS = "status";

    public static final String COL_CLICK_COUNT = "click_count";

    public static final String COL_ORDER_COUNT = "order_count";

    public static final String COL_URL = "url";

    public static final String COL_NOTE = "note";

    public static final String COL_SORT = "sort";
}
