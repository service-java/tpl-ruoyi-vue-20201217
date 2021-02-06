package com.ruoyi.pms.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:32
 */
/**
    * 商品审核记录
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsProductVertifyRecord")
@Data
@TableName(value = "pms_product_vertify_record")
public class PmsProductVertifyRecord {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "product_id")
    @ApiModelProperty(value="")
    private Long productId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    /**
     * 审核人
     */
    @TableField(value = "vertify_man")
    @ApiModelProperty(value="审核人")
    private String vertifyMan;

    @TableField(value = "`status`")
    @ApiModelProperty(value="")
    private Integer status;

    /**
     * 反馈详情
     */
    @TableField(value = "detail")
    @ApiModelProperty(value="反馈详情")
    private String detail;

    public static final String COL_ID = "id";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_VERTIFY_MAN = "vertify_man";

    public static final String COL_STATUS = "status";

    public static final String COL_DETAIL = "detail";
}
