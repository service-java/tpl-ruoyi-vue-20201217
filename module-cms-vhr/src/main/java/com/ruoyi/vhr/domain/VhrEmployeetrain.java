package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrEmployeetrain")
@Data
@TableName(value = "vhr_employeetrain")
public class VhrEmployeetrain {
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
     * 培训日期
     */
    @TableField(value = "trainDate")
    @ApiModelProperty(value = "培训日期")
    private Date traindate;

    /**
     * 培训内容
     */
    @TableField(value = "trainContent")
    @ApiModelProperty(value = "培训内容")
    private String traincontent;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_TRAINDATE = "trainDate";

    public static final String COL_TRAINCONTENT = "trainContent";

    public static final String COL_REMARK = "remark";
}