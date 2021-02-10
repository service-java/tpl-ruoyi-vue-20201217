package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrEmployeeec")
@Data
@TableName(value = "vhr_employeeec")
public class VhrEmployeeec {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 员工编号
     */
    @TableField(value = "eid")
    @ApiModelProperty(value = "员工编号")
    private Integer eid;

    /**
     * 奖罚日期
     */
    @TableField(value = "ecDate")
    @ApiModelProperty(value = "奖罚日期")
    private Date ecdate;

    /**
     * 奖罚原因
     */
    @TableField(value = "ecReason")
    @ApiModelProperty(value = "奖罚原因")
    private String ecreason;

    /**
     * 奖罚分
     */
    @TableField(value = "ecPoint")
    @ApiModelProperty(value = "奖罚分")
    private Integer ecpoint;

    /**
     * 奖罚类别，0：奖，1：罚
     */
    @TableField(value = "ecType")
    @ApiModelProperty(value = "奖罚类别，0：奖，1：罚")
    private Integer ectype;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_ECDATE = "ecDate";

    public static final String COL_ECREASON = "ecReason";

    public static final String COL_ECPOINT = "ecPoint";

    public static final String COL_ECTYPE = "ecType";

    public static final String COL_REMARK = "remark";
}