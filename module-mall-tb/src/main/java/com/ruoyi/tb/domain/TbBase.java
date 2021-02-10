package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbBase")
@Data
@TableName(value = "tb_base")
public class TbBase {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "web_name")
    @ApiModelProperty(value="")
    private String webName;

    @TableField(value = "key_word")
    @ApiModelProperty(value="")
    private String keyWord;

    @TableField(value = "description")
    @ApiModelProperty(value="")
    private String description;

    @TableField(value = "source_path")
    @ApiModelProperty(value="")
    private String sourcePath;

    @TableField(value = "upload_path")
    @ApiModelProperty(value="")
    private String uploadPath;

    @TableField(value = "copyright")
    @ApiModelProperty(value="")
    private String copyright;

    @TableField(value = "count_code")
    @ApiModelProperty(value="")
    private String countCode;

    @TableField(value = "has_log_notice")
    @ApiModelProperty(value="")
    private Integer hasLogNotice;

    @TableField(value = "log_notice")
    @ApiModelProperty(value="")
    private String logNotice;

    @TableField(value = "has_all_notice")
    @ApiModelProperty(value="")
    private Integer hasAllNotice;

    @TableField(value = "all_notice")
    @ApiModelProperty(value="")
    private String allNotice;

    @TableField(value = "notice")
    @ApiModelProperty(value="")
    private String notice;

    @TableField(value = "update_log")
    @ApiModelProperty(value="")
    private String updateLog;

    @TableField(value = "front_url")
    @ApiModelProperty(value="")
    private String frontUrl;

    public static final String COL_ID = "id";

    public static final String COL_WEB_NAME = "web_name";

    public static final String COL_KEY_WORD = "key_word";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_SOURCE_PATH = "source_path";

    public static final String COL_UPLOAD_PATH = "upload_path";

    public static final String COL_COPYRIGHT = "copyright";

    public static final String COL_COUNT_CODE = "count_code";

    public static final String COL_HAS_LOG_NOTICE = "has_log_notice";

    public static final String COL_LOG_NOTICE = "log_notice";

    public static final String COL_HAS_ALL_NOTICE = "has_all_notice";

    public static final String COL_ALL_NOTICE = "all_notice";

    public static final String COL_NOTICE = "notice";

    public static final String COL_UPDATE_LOG = "update_log";

    public static final String COL_FRONT_URL = "front_url";
}