package com.ruoyi.pms.domain;

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
 * Date: 2020-12-22 16:32
 */
/**
    * 品牌表
    */
@ApiModel(value="com-ruoyi-pms-domain-PmsBrand")
@Data
@TableName(value = "pms_brand")
public class PmsBrand {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Long id;

    @TableField(value = "`name`")
    @ApiModelProperty(value="")
    private String name;

    /**
     * 首字母
     */
    @TableField(value = "first_letter")
    @ApiModelProperty(value="首字母")
    private String firstLetter;

    @TableField(value = "sort")
    @ApiModelProperty(value="")
    private Integer sort;

    /**
     * 是否为品牌制造商：0->不是；1->是
     */
    @TableField(value = "factory_status")
    @ApiModelProperty(value="是否为品牌制造商：0->不是；1->是")
    private Integer factoryStatus;

    @TableField(value = "show_status")
    @ApiModelProperty(value="")
    private Integer showStatus;

    /**
     * 产品数量
     */
    @TableField(value = "product_count")
    @ApiModelProperty(value="产品数量")
    private Integer productCount;

    /**
     * 产品评论数量
     */
    @TableField(value = "product_comment_count")
    @ApiModelProperty(value="产品评论数量")
    private Integer productCommentCount;

    /**
     * 品牌logo
     */
    @TableField(value = "logo")
    @ApiModelProperty(value="品牌logo")
    private String logo;

    /**
     * 专区大图
     */
    @TableField(value = "big_pic")
    @ApiModelProperty(value="专区大图")
    private String bigPic;

    /**
     * 品牌故事
     */
    @TableField(value = "brand_story")
    @ApiModelProperty(value="品牌故事")
    private String brandStory;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_FIRST_LETTER = "first_letter";

    public static final String COL_SORT = "sort";

    public static final String COL_FACTORY_STATUS = "factory_status";

    public static final String COL_SHOW_STATUS = "show_status";

    public static final String COL_PRODUCT_COUNT = "product_count";

    public static final String COL_PRODUCT_COMMENT_COUNT = "product_comment_count";

    public static final String COL_LOGO = "logo";

    public static final String COL_BIG_PIC = "big_pic";

    public static final String COL_BRAND_STORY = "brand_story";
}