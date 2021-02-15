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
    * 小说目录表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBookIndex")
@Data
@TableName(value = "nvc_book_index")
public class NvcBookIndex {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 小说ID
     */
    @TableField(value = "book_id")
    @ApiModelProperty(value="小说ID")
    private Long bookId;

    /**
     * 目录号
     */
    @TableField(value = "index_num")
    @ApiModelProperty(value="目录号")
    private Integer indexNum;

    /**
     * 目录名
     */
    @TableField(value = "index_name")
    @ApiModelProperty(value="目录名")
    private String indexName;

    /**
     * 字数
     */
    @TableField(value = "word_count")
    @ApiModelProperty(value="字数")
    private Integer wordCount;

    /**
     * 是否收费，1：收费，0：免费
     */
    @TableField(value = "is_vip")
    @ApiModelProperty(value="是否收费，1：收费，0：免费")
    private Byte isVip;

    @TableField(value = "create_time")
    @ApiModelProperty(value="")
    private Date createTime;

    @TableField(value = "update_time")
    @ApiModelProperty(value="")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_BOOK_ID = "book_id";

    public static final String COL_INDEX_NUM = "index_num";

    public static final String COL_INDEX_NAME = "index_name";

    public static final String COL_WORD_COUNT = "word_count";

    public static final String COL_IS_VIP = "is_vip";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}