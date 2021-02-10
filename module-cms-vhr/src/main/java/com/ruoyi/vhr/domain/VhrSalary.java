package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrSalary")
@Data
@TableName(value = "vhr_salary")
public class VhrSalary {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    /**
     * 基本工资
     */
    @TableField(value = "basicSalary")
    @ApiModelProperty(value = "基本工资")
    private Integer basicsalary;

    /**
     * 奖金
     */
    @TableField(value = "bonus")
    @ApiModelProperty(value = "奖金")
    private Integer bonus;

    /**
     * 午餐补助
     */
    @TableField(value = "lunchSalary")
    @ApiModelProperty(value = "午餐补助")
    private Integer lunchsalary;

    /**
     * 交通补助
     */
    @TableField(value = "trafficSalary")
    @ApiModelProperty(value = "交通补助")
    private Integer trafficsalary;

    /**
     * 应发工资
     */
    @TableField(value = "allSalary")
    @ApiModelProperty(value = "应发工资")
    private Integer allsalary;

    /**
     * 养老金基数
     */
    @TableField(value = "pensionBase")
    @ApiModelProperty(value = "养老金基数")
    private Integer pensionbase;

    /**
     * 养老金比率
     */
    @TableField(value = "pensionPer")
    @ApiModelProperty(value = "养老金比率")
    private Double pensionper;

    /**
     * 启用时间
     */
    @TableField(value = "createDate")
    @ApiModelProperty(value = "启用时间")
    private Date createdate;

    /**
     * 医疗基数
     */
    @TableField(value = "medicalBase")
    @ApiModelProperty(value = "医疗基数")
    private Integer medicalbase;

    /**
     * 医疗保险比率
     */
    @TableField(value = "medicalPer")
    @ApiModelProperty(value = "医疗保险比率")
    private Double medicalper;

    /**
     * 公积金基数
     */
    @TableField(value = "accumulationFundBase")
    @ApiModelProperty(value = "公积金基数")
    private Integer accumulationfundbase;

    /**
     * 公积金比率
     */
    @TableField(value = "accumulationFundPer")
    @ApiModelProperty(value = "公积金比率")
    private Double accumulationfundper;

    @TableField(value = "`name`")
    @ApiModelProperty(value = "")
    private String name;

    public static final String COL_ID = "id";

    public static final String COL_BASICSALARY = "basicSalary";

    public static final String COL_BONUS = "bonus";

    public static final String COL_LUNCHSALARY = "lunchSalary";

    public static final String COL_TRAFFICSALARY = "trafficSalary";

    public static final String COL_ALLSALARY = "allSalary";

    public static final String COL_PENSIONBASE = "pensionBase";

    public static final String COL_PENSIONPER = "pensionPer";

    public static final String COL_CREATEDATE = "createDate";

    public static final String COL_MEDICALBASE = "medicalBase";

    public static final String COL_MEDICALPER = "medicalPer";

    public static final String COL_ACCUMULATIONFUNDBASE = "accumulationFundBase";

    public static final String COL_ACCUMULATIONFUNDPER = "accumulationFundPer";

    public static final String COL_NAME = "name";
}