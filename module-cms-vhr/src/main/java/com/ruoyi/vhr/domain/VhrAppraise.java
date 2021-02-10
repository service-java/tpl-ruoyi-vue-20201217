package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrAppraise")
@Data
@TableName(value = "vhr_appraise")
public class VhrAppraise {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "eid")
    @ApiModelProperty(value = "")
    private Integer eid;

    /**
     * 考评日期
     */
    @TableField(value = "appDate")
    @ApiModelProperty(value = "考评日期")
    private Date appdate;

    /**
     * 考评结果
     */
    @TableField(value = "appResult")
    @ApiModelProperty(value = "考评结果")
    private String appresult;

    /**
     * 考评内容
     */
    @TableField(value = "appContent")
    @ApiModelProperty(value = "考评内容")
    private String appcontent;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    public static final String COL_ID = "id";

    public static final String COL_EID = "eid";

    public static final String COL_APPDATE = "appDate";

    public static final String COL_APPRESULT = "appResult";

    public static final String COL_APPCONTENT = "appContent";

    public static final String COL_REMARK = "remark";
}