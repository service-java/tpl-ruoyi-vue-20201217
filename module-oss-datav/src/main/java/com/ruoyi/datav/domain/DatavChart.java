package com.ruoyi.datav.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import lombok.Data;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 18:50
 */
@ApiModel(value = "com-ruoyi-datav-domain-DatavChart")
@Data
@TableName(value = "datav_chart")
public class DatavChart {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * yyyy-MM编码
     */
    @TableField(value = "code")
    @ApiModelProperty(value = "yyyy-MM编码")
    private String code;

    /**
     * 价格
     */
    @TableField(value = "price")
    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_PRICE = "price";
}