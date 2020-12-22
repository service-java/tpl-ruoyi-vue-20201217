package com.ruoyi.sms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2020-12-22 16:29
 */
/**
    * 首页推荐品牌表
    */
@ApiModel(value="com-ruoyi-sms-domain-SmsHomeBrand")
@Data
@TableName(value = "sms_home_brand")
public class SmsHomeBrand {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "brand_id")
    @ApiModelProperty(value="")
    private Long brandId;

    @TableField(value = "brand_name")
    @ApiModelProperty(value="")
    private String brandName;

    @TableField(value = "recommend_status")
    @ApiModelProperty(value="")
    private Integer recommendStatus;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    public static final String COL_ID = "id";

    public static final String COL_BRAND_ID = "brand_id";

    public static final String COL_BRAND_NAME = "brand_name";

    public static final String COL_RECOMMEND_STATUS = "recommend_status";

    public static final String COL_SORT = "sort";
}