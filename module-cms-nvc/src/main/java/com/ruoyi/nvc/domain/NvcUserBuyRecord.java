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
    * 用户消费记录表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcUserBuyRecord")
@Data
@TableName(value = "nvc_user_buy_record")
public class NvcUserBuyRecord {
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
     * 购买的小说ID
     */
    @TableField(value = "book_id")
    @ApiModelProperty(value="购买的小说ID")
    private Long bookId;

    /**
     * 购买的小说名
     */
    @TableField(value = "book_name")
    @ApiModelProperty(value="购买的小说名")
    private String bookName;

    /**
     * 购买的章节ID
     */
    @TableField(value = "book_index_id")
    @ApiModelProperty(value="购买的章节ID")
    private Long bookIndexId;

    /**
     * 购买的章节名
     */
    @TableField(value = "book_index_name")
    @ApiModelProperty(value="购买的章节名")
    private String bookIndexName;

    /**
     * 购买使用的屋币数量
     */
    @TableField(value = "buy_amount")
    @ApiModelProperty(value="购买使用的屋币数量")
    private Integer buyAmount;

    /**
     * 购买时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="购买时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_BOOK_NAME = "book_name";

    public static final String COL_BOOK_INDEX_ID = "book_index_id";

    public static final String COL_BOOK_INDEX_NAME = "book_index_name";

    public static final String COL_BUY_AMOUNT = "buy_amount";

    public static final String COL_CREATE_TIME = "create_time";
}