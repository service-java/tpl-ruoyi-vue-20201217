package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrEmployee")
@Data
@TableName(value = "vhr_employee")
public class VhrEmployee {
    /**
     * 员工编号
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "员工编号")
    private Integer id;

    /**
     * 员工姓名
     */
    @TableField(value = "`name`")
    @ApiModelProperty(value = "员工姓名")
    private String name;

    /**
     * 性别
     */
    @TableField(value = "gender")
    @ApiModelProperty(value = "性别")
    private String gender;

    /**
     * 出生日期
     */
    @TableField(value = "birthday")
    @ApiModelProperty(value = "出生日期")
    private Date birthday;

    /**
     * 身份证号
     */
    @TableField(value = "idCard")
    @ApiModelProperty(value = "身份证号")
    private String idcard;

    /**
     * 婚姻状况
     */
    @TableField(value = "wedlock")
    @ApiModelProperty(value = "婚姻状况")
    private Object wedlock;

    /**
     * 民族
     */
    @TableField(value = "nationId")
    @ApiModelProperty(value = "民族")
    private Integer nationid;

    /**
     * 籍贯
     */
    @TableField(value = "nativePlace")
    @ApiModelProperty(value = "籍贯")
    private String nativeplace;

    /**
     * 政治面貌
     */
    @TableField(value = "politicId")
    @ApiModelProperty(value = "政治面貌")
    private Integer politicid;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 电话号码
     */
    @TableField(value = "phone")
    @ApiModelProperty(value = "电话号码")
    private String phone;

    /**
     * 联系地址
     */
    @TableField(value = "address")
    @ApiModelProperty(value = "联系地址")
    private String address;

    /**
     * 所属部门
     */
    @TableField(value = "departmentId")
    @ApiModelProperty(value = "所属部门")
    private Integer departmentid;

    /**
     * 职称ID
     */
    @TableField(value = "jobLevelId")
    @ApiModelProperty(value = "职称ID")
    private Integer joblevelid;

    /**
     * 职位ID
     */
    @TableField(value = "posId")
    @ApiModelProperty(value = "职位ID")
    private Integer posid;

    /**
     * 聘用形式
     */
    @TableField(value = "engageForm")
    @ApiModelProperty(value = "聘用形式")
    private String engageform;

    /**
     * 最高学历
     */
    @TableField(value = "tiptopDegree")
    @ApiModelProperty(value = "最高学历")
    private Object tiptopdegree;

    /**
     * 所属专业
     */
    @TableField(value = "specialty")
    @ApiModelProperty(value = "所属专业")
    private String specialty;

    /**
     * 毕业院校
     */
    @TableField(value = "school")
    @ApiModelProperty(value = "毕业院校")
    private String school;

    /**
     * 入职日期
     */
    @TableField(value = "beginDate")
    @ApiModelProperty(value = "入职日期")
    private Date begindate;

    /**
     * 在职状态
     */
    @TableField(value = "workState")
    @ApiModelProperty(value = "在职状态")
    private Object workstate;

    /**
     * 工号
     */
    @TableField(value = "workID")
    @ApiModelProperty(value = "工号")
    private String workid;

    /**
     * 合同期限
     */
    @TableField(value = "contractTerm")
    @ApiModelProperty(value = "合同期限")
    private Double contractterm;

    /**
     * 转正日期
     */
    @TableField(value = "conversionTime")
    @ApiModelProperty(value = "转正日期")
    private Date conversiontime;

    /**
     * 离职日期
     */
    @TableField(value = "notWorkDate")
    @ApiModelProperty(value = "离职日期")
    private Date notworkdate;

    /**
     * 合同起始日期
     */
    @TableField(value = "beginContract")
    @ApiModelProperty(value = "合同起始日期")
    private Date begincontract;

    /**
     * 合同终止日期
     */
    @TableField(value = "endContract")
    @ApiModelProperty(value = "合同终止日期")
    private Date endcontract;

    /**
     * 工龄
     */
    @TableField(value = "workAge")
    @ApiModelProperty(value = "工龄")
    private Integer workage;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_GENDER = "gender";

    public static final String COL_BIRTHDAY = "birthday";

    public static final String COL_IDCARD = "idCard";

    public static final String COL_WEDLOCK = "wedlock";

    public static final String COL_NATIONID = "nationId";

    public static final String COL_NATIVEPLACE = "nativePlace";

    public static final String COL_POLITICID = "politicId";

    public static final String COL_EMAIL = "email";

    public static final String COL_PHONE = "phone";

    public static final String COL_ADDRESS = "address";

    public static final String COL_DEPARTMENTID = "departmentId";

    public static final String COL_JOBLEVELID = "jobLevelId";

    public static final String COL_POSID = "posId";

    public static final String COL_ENGAGEFORM = "engageForm";

    public static final String COL_TIPTOPDEGREE = "tiptopDegree";

    public static final String COL_SPECIALTY = "specialty";

    public static final String COL_SCHOOL = "school";

    public static final String COL_BEGINDATE = "beginDate";

    public static final String COL_WORKSTATE = "workState";

    public static final String COL_WORKID = "workID";

    public static final String COL_CONTRACTTERM = "contractTerm";

    public static final String COL_CONVERSIONTIME = "conversionTime";

    public static final String COL_NOTWORKDATE = "notWorkDate";

    public static final String COL_BEGINCONTRACT = "beginContract";

    public static final String COL_ENDCONTRACT = "endContract";

    public static final String COL_WORKAGE = "workAge";
}