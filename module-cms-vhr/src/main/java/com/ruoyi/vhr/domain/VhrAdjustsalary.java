package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrAdjustsalary")
@Data
@TableName(value = "vhr_adjustsalary")
public class VhrAdjustsalary {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "eid")
    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 调薪日期
     */
    @TableField(value = "asDate")
    @ApiModelProperty(value = "调薪日期")
    private Date asdate;

    /**
     * 调前薪资
     */
    @TableField(value = "beforeSalary")
    @ApiModelProperty(value = "调前薪资")
    private Integer beforesalary;

    /**
     * 调后薪资
     */
    @TableField(value = "afterSalary")
    @ApiModelProperty(value = "调后薪资")
    private Integer aftersalary;

    /**
     * 调薪原因
     */
    @TableField(value = "reason")
    @ApiModelProperty(value = "调薪原因")
    private String reason;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_ASDATE = "asDate";

    public static final String COL_BEFORESALARY = "beforeSalary";

    public static final String COL_AFTERSALARY = "afterSalary";

    public static final String COL_REASON = "reason";

    public static final String COL_REMARK = "remark";
}