package com.ruoyi.oms.domain;

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
 * Date: 2020-12-22 16:28
 */
/**
    * 订单操作历史记录
    */
@ApiModel(value="com-ruoyi-oms-domain-OmsOrderOperateHistory")
@Data
@TableName(value = "oms_order_operate_history")
public class OmsOrderOperateHistory {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    /**
     * 订单id
     */
    @TableField(value = "order_id")
    @ApiModelProperty(value="订单id")
    private Long orderId;

    /**
     * 操作人：用户；系统；后台管理员
     */
    @TableField(value = "operate_man")
    @ApiModelProperty(value="操作人：用户；系统；后台管理员")
    private String operateMan;

    /**
     * 操作时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="操作时间")
    private Date createTime;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @TableField(value = "order_status")
    @ApiModelProperty(value="订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer orderStatus;

    /**
     * 备注
     */
    @TableField(value = "note")
    @ApiModelProperty(value="备注")
    private String note;

    public static final String COL_ID = "id";

    public static final String COL_ORDER_ID = "order_id";

    public static final String COL_OPERATE_MAN = "operate_man";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_ORDER_STATUS = "order_status";

    public static final String COL_NOTE = "note";
}
