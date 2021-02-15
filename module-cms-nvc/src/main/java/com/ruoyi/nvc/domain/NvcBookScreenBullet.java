package com.ruoyi.nvc.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

/**
 * Description: 模块功能描述
 * 
 * User: luo0412
 * Date: 2021-02-15 15:57
 */
/**
    * 小说弹幕表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookScreenBullet")
@Data
@TableName(value = "nvc_book_screen_bullet")
public class NvcBookScreenBullet {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 小说内容ID
     */
    @TableField(value = "content_id")
    @ApiModelProperty(value="小说内容ID")
    private Long contentId;

    /**
     * 小说弹幕内容
     */
    @TableField(value = "screen_bullet")
    @ApiModelProperty(value="小说弹幕内容")
    private String screenBullet;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_CONTENT_ID = "content_id";

    public static final String COL_SCREEN_BULLET = "screen_bullet";

    public static final String COL_CREATE_TIME = "create_time";
}