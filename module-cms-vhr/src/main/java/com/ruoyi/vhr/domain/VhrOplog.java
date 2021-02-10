package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrOplog")
@Data
@TableName(value = "vhr_oplog")
public class VhrOplog {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 添加日期
     */
    @TableField(value = "addDate")
    @ApiModelProperty(value = "添加日期")
    private Date adddate;

    /**
     * 操作内容
     */
    @TableField(value = "operate")
    @ApiModelProperty(value = "操作内容")
    private String operate;

    /**
     * 操作员ID
     */
    @TableField(value = "hrid")
    @ApiModelProperty(value = "操作员ID")
    private Integer hrid;

    public static final String COL_ID = "id";

    public static final String COL_ADDDATE = "addDate";

    public static final String COL_OPERATE = "operate";

    public static final String COL_HRID = "hrid";
}