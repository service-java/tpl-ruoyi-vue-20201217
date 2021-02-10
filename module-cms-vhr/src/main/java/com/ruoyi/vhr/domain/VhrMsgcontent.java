package com.ruoyi.vhr.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value = "com-ruoyi-vhr-domain-VhrMsgcontent")
@Data
@TableName(value = "vhr_msgcontent")
public class VhrMsgcontent {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "")
    private Integer id;

    @TableField(value = "title")
    @ApiModelProperty(value = "")
    private String title;

    @TableField(value = "message")
    @ApiModelProperty(value = "")
    private String message;

    @TableField(value = "createDate")
    @ApiModelProperty(value = "")
    private Date createdate;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_MESSAGE = "message";

    public static final String COL_CREATEDATE = "createDate";
}