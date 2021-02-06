package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:14
 */

/**
 * 用户举报表
 */
@ApiModel(value = "com-ruoyi-cms-domain-CmsMemberReport")
@Data
@TableName(value = "cms_member_report")
public class CmsMemberReport {
    @TableField(value = "id")
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 举报类型：0->商品评价；1->话题内容；2->用户评论
     */
    @TableField(value = "report_type")
    @ApiModelProperty(value = "举报类型：0->商品评价；1->话题内容；2->用户评论")
    private Integer reportType;

    /**
     * 举报人
     */
    @TableField(value = "report_member_name")
    @ApiModelProperty(value = "举报人")
    private String reportMemberName;

    @TableField(value = "create_time")
    @ApiModelProperty(value = "")
    private Date createTime;

    @TableField(value = "report_object")
    @ApiModelProperty(value = "")
    private String reportObject;

    /**
     * 举报状态：0->未处理；1->已处理
     */
    @TableField(value = "report_status")
    @ApiModelProperty(value = "举报状态：0->未处理；1->已处理")
    private Integer reportStatus;

    /**
     * 处理结果：0->无效；1->有效；2->恶意
     */
    @TableField(value = "handle_status")
    @ApiModelProperty(value = "处理结果：0->无效；1->有效；2->恶意")
    private Integer handleStatus;

    @TableField(value = "note")
    @ApiModelProperty(value = "")
    private String note;

    public static final String COL_ID = "id";

    public static final String COL_REPORT_TYPE = "report_type";

    public static final String COL_REPORT_MEMBER_NAME = "report_member_name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_REPORT_OBJECT = "report_object";

    public static final String COL_REPORT_STATUS = "report_status";

    public static final String COL_HANDLE_STATUS = "handle_status";

    public static final String COL_NOTE = "note";
}
