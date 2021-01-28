package com.ruoyi.cms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-16 9:28
 */

/**
 * 系统配置信息表
 */
@ApiModel
@Data
public class OssConfig implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * key
     */
    @TableField(value = "param_key")
    @ApiModelProperty(value = "key")
    private String paramKey;

    /**
     * value
     */
    @TableField(value = "param_value")
    @ApiModelProperty(value = "value")
    private String paramValue;

    /**
     * 状态   0：隐藏   1：显示
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value = "状态   0：隐藏   1：显示")
    private Byte status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PARAM_KEY = "param_key";

    public static final String COL_PARAM_VALUE = "param_value";

    public static final String COL_STATUS = "status";

    public static final String COL_REMARK = "remark";
}
