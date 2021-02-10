package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbDict")
@Data
@TableName(value = "tb_dict")
public class TbDict {
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Integer id;

    @TableField(value = "dict")
    @ApiModelProperty(value="")
    private String dict;

    /**
     * 1扩展词 0停用词
     */
    @TableField(value = "`type`")
    @ApiModelProperty(value="1扩展词 0停用词")
    private Integer type;

    public static final String COL_ID = "id";

    public static final String COL_DICT = "dict";

    public static final String COL_TYPE = "type";
}