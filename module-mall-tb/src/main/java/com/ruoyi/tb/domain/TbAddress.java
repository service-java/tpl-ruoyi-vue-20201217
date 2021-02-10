package com.ruoyi.tb.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-ruoyi-tb-domain-TbAddress")
@Data
@TableName(value = "tb_address")
public class TbAddress {
    @TableId(value = "address_id", type = IdType.INPUT)
    @ApiModelProperty(value="")
    private Long addressId;

    @TableField(value = "user_id")
    @ApiModelProperty(value="")
    private Long userId;

    @TableField(value = "user_name")
    @ApiModelProperty(value="")
    private String userName;

    @TableField(value = "tel")
    @ApiModelProperty(value="")
    private String tel;

    @TableField(value = "street_name")
    @ApiModelProperty(value="")
    private String streetName;

    @TableField(value = "is_default")
    @ApiModelProperty(value="")
    private Boolean isDefault;

    public static final String COL_ADDRESS_ID = "address_id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_TEL = "tel";

    public static final String COL_STREET_NAME = "street_name";

    public static final String COL_IS_DEFAULT = "is_default";
}