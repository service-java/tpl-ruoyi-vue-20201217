package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbLog")
@Data
@TableName(value = "tb_log")
public class TbLog {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "`type`")
    @ApiModelProperty(value="")
    private Integer type;

    @TableField(value = "url")
    @ApiModelProperty(value="")
    private String url;

    @TableField(value = "request_type")
    @ApiModelProperty(value="")
    private String requestType;

    @TableField(value = "request_param")
    @ApiModelProperty(value="")
    private String requestParam;

    @TableField(value = "`user`")
    @ApiModelProperty(value="")
    private String user;

    @TableField(value = "ip")
    @ApiModelProperty(value="")
    private String ip;

    @TableField(value = "ip_info")
    @ApiModelProperty(value="")
    private String ipInfo;

    @TableField(value = "`time`")
    @ApiModelProperty(value="")
    private Integer time;

    @TableField(value = "create_date")
    @ApiModelProperty(value="")
    private Date createDate;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_TYPE = "type";

    public static final String COL_URL = "url";

    public static final String COL_REQUEST_TYPE = "request_type";

    public static final String COL_REQUEST_PARAM = "request_param";

    public static final String COL_USER = "user";

    public static final String COL_IP = "ip";

    public static final String COL_IP_INFO = "ip_info";

    public static final String COL_TIME = "time";

    public static final String COL_CREATE_DATE = "create_date";
}