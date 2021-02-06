package com.ruoyi.ums.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Description: 模块功能描述
 *
 * User: luo0412
 * Date: 2020-12-22 16:30
 */
/**
    * 会员等级表
    */
@ApiModel(value="com-ruoyi-ums-domain-UmsMemberLevel")
@Data
@TableName(value = "ums_member_level")
public class UmsMemberLevel {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    @TableField(value = "growth_point")
    @ApiModelProperty(value="")
    private Integer growthPoint;

    /**
     * 是否为默认等级：0->不是；1->是
     */
    @TableField(value = "default_status")
    @ApiModelProperty(value="是否为默认等级：0->不是；1->是")
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    @TableField(value = "free_freight_point")
    @ApiModelProperty(value="免运费标准")
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @TableField(value = "comment_growth_point")
    @ApiModelProperty(value="每次评价获取的成长值")
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @TableField(value = "priviledge_free_freight")
    @ApiModelProperty(value="是否有免邮特权")
    private Integer priviledgeFreeFreight;

    /**
     * 是否有签到特权
     */
    @TableField(value = "priviledge_sign_in")
    @ApiModelProperty(value="是否有签到特权")
    private Integer priviledgeSignIn;

    /**
     * 是否有评论获奖励特权
     */
    @TableField(value = "priviledge_comment")
    @ApiModelProperty(value="是否有评论获奖励特权")
    private Integer priviledgeComment;

    /**
     * 是否有专享活动特权
     */
    @TableField(value = "priviledge_promotion")
    @ApiModelProperty(value="是否有专享活动特权")
    private Integer priviledgePromotion;

    /**
     * 是否有会员价格特权
     */
    @TableField(value = "priviledge_member_price")
    @ApiModelProperty(value="是否有会员价格特权")
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @TableField(value = "priviledge_birthday")
    @ApiModelProperty(value="是否有生日特权")
    private Integer priviledgeBirthday;

    @TableField(value = "note")
    @ApiModelProperty(value="")
    private String note;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_GROWTH_POINT = "growth_point";

    public static final String COL_DEFAULT_STATUS = "default_status";

    public static final String COL_FREE_FREIGHT_POINT = "free_freight_point";

    public static final String COL_COMMENT_GROWTH_POINT = "comment_growth_point";

    public static final String COL_PRIVILEDGE_FREE_FREIGHT = "priviledge_free_freight";

    public static final String COL_PRIVILEDGE_SIGN_IN = "priviledge_sign_in";

    public static final String COL_PRIVILEDGE_COMMENT = "priviledge_comment";

    public static final String COL_PRIVILEDGE_PROMOTION = "priviledge_promotion";

    public static final String COL_PRIVILEDGE_MEMBER_PRICE = "priviledge_member_price";

    public static final String COL_PRIVILEDGE_BIRTHDAY = "priviledge_birthday";

    public static final String COL_NOTE = "note";
}
