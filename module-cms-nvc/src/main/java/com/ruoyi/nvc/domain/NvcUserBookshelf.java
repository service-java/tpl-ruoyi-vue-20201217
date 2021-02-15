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
    * 用户书架表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcUserBookshelf")
@Data
@TableName(value = "nvc_user_bookshelf")
public class NvcUserBookshelf {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    @ApiModelProperty(value="用户ID")
    private Long userId;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    @ApiModelProperty(value="小说ID")
    private Long bookId;

    /**
     * 上一次阅读的章节内容表ID
     */
    @TableField(value = "pre_content_id")
    @ApiModelProperty(value="上一次阅读的章节内容表ID")
    private Long preContentId;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "update_time")
    @ApiModelProperty(value="")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_PRE_CONTENT_ID = "pre_content_id";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}