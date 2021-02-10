package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrSysmsg")
@Data
@TableName(value = "vhr_sysmsg")
public class VhrSysmsg {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 消息id
     */
    @TableField(value = "mid")
    @ApiModelProperty(value = "消息id")
    private Integer mid;

    /**
     * 0表示群发消息
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value = "0表示群发消息")
    private Integer type;

    /**
     * 这条消息是给谁的
     */
    @TableField(value = "hrid")
    @ApiModelProperty(value = "这条消息是给谁的")
    private Integer hrid;

    /**
     * 0 未读 1 已读
     */
    @TableField(value = "`state`")
    @ApiModelProperty(value = "0 未读 1 已读")
    private Integer state;

    public static final String COL_ID = "id";

    public static final String COL_MID = "mid";

    public static final String COL_TYPE = "type";

    public static final String COL_HRID = "hrid";

    public static final String COL_STATE = "state";
}