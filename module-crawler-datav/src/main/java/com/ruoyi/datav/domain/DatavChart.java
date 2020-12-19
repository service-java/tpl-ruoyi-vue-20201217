package com.ruoyi.datav.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.beetl.sql.core.annotatoin.Table;

import java.math.BigDecimal;

/**
 * Description: 模块功能描述
 * <p>
 * User: luo0412
 * Date: 2020-12-17 18:50
 */
@ApiModel(value = "com-ruoyi-datav-domain-DatavChart")
@Data
@Table(name="datav_chart")
public class DatavChart {
    /**
     * 主键
     */
    @ApiModelProperty(value = "主键")
    private Integer id;

    /**
     * yyyy-MM编码
     */
    @ApiModelProperty(value = "yyyy-MM编码")
    private String code;

    /**
     * 价格
     */
    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    public static final String COL_ID = "id";

    public static final String COL_CODE = "code";

    public static final String COL_PRICE = "price";
}
