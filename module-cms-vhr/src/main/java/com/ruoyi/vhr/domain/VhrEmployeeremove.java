package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrEmployeeremove")
@Data
@TableName(value = "vhr_employeeremove")
public class VhrEmployeeremove {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "eid")
    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 调动后部门
     */
    @TableField(value = "afterDepId")
    @ApiModelProperty(value = "调动后部门")
    private Integer afterdepid;

    /**
     * 调动后职位
     */
    @TableField(value = "afterJobId")
    @ApiModelProperty(value = "调动后职位")
    private Integer afterjobid;

    /**
     * 调动日期
     */
    @TableField(value = "removeDate")
    @ApiModelProperty(value = "调动日期")
    private Date removedate;

    /**
     * 调动原因
     */
    @TableField(value = "reason")
    @ApiModelProperty(value = "调动原因")
    private String reason;

    @TableField(value = "remark")
    @ApiModelProperty(value = "")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_AFTERDEPID = "afterDepId";

    public static final String COL_AFTERJOBID = "afterJobId";

    public static final String COL_REMOVEDATE = "removeDate";

    public static final String COL_REASON = "reason";

    public static final String COL_REMARK = "remark";
}