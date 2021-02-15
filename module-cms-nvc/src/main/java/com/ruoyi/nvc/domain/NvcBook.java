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
    * 小说表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcBook")
@Data
@TableName(value = "nvc_book")
public class NvcBook {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 作品方向，0：男频，1：女频'
     */
    @TableField(value = "work_direction")
    @ApiModelProperty(value="作品方向，0：男频，1：女频'")
    private Boolean workDirection;

    /**
     * 分类ID
     */
    @TableField(value = "cat_id")
    @ApiModelProperty(value="分类ID")
    private Integer catId;

    /**
     * 分类名
     */
    @TableField(value = "cat_name")
    @ApiModelProperty(value="分类名")
    private String catName;

    /**
     * 小说封面
     */
    @TableField(value = "pic_url")
    @ApiModelProperty(value="小说封面")
    private String picUrl;

    /**
     * 小说名
     */
    @TableField(value = "book_name")
    @ApiModelProperty(value="小说名")
    private String bookName;

    /**
     * 作者id
     */
    @TableField(value = "author_id")
    @ApiModelProperty(value="作者id")
    private Long authorId;

    /**
     * 作者名
     */
    @TableField(value = "author_name")
    @ApiModelProperty(value="作者名")
    private String authorName;

    /**
     * 书籍描述
     */
    @TableField(value = "book_desc")
    @ApiModelProperty(value="书籍描述")
    private String bookDesc;

    /**
     * 评分，预留字段
     */
    @TableField(value = "score")
    @ApiModelProperty(value="评分，预留字段")
    private Double score;

    /**
     * 书籍状态，0：连载中，1：已完结
     */
    @TableField(value = "book_status")
    @ApiModelProperty(value="书籍状态，0：连载中，1：已完结")
    private Boolean bookStatus;

    /**
     * 点击量
     */
    @TableField(value = "visit_count")
    @ApiModelProperty(value="点击量")
    private Long visitCount;

    /**
     * 总字数
     */
    @TableField(value = "word_count")
    @ApiModelProperty(value="总字数")
    private Integer wordCount;

    /**
     * 评论数
     */
    @TableField(value = "comment_count")
    @ApiModelProperty(value="评论数")
    private Integer commentCount;

    /**
     * 最新目录ID
     */
    @TableField(value = "last_index_id")
    @ApiModelProperty(value="最新目录ID")
    private Long lastIndexId;

    /**
     * 最新目录名
     */
    @TableField(value = "last_index_name")
    @ApiModelProperty(value="最新目录名")
    private String lastIndexName;

    /**
     * 最新目录更新时间
     */
    @TableField(value = "last_index_update_time")
    @ApiModelProperty(value="最新目录更新时间")
    private Date lastIndexUpdateTime;

    /**
     * 是否收费，1：收费，0：免费
     */
    @TableField(value = "is_vip")
    @ApiModelProperty(value="是否收费，1：收费，0：免费")
    private Boolean isVip;

    /**
     * 状态，0：入库，1：上架
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="状态，0：入库，1：上架")
    private Boolean status;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 爬虫源站ID
     */
    @TableField(value = "crawl_source_id")
    @ApiModelProperty(value="爬虫源站ID")
    private Integer crawlSourceId;

    /**
     * 抓取的源站小说ID
     */
    @TableField(value = "crawl_book_id")
    @ApiModelProperty(value="抓取的源站小说ID")
    private String crawlBookId;

    /**
     * 最后一次的抓取时间
     */
    @TableField(value = "crawl_last_time")
    @ApiModelProperty(value="最后一次的抓取时间")
    private Date crawlLastTime;

    /**
     * 是否已停止更新，0：未停止，1：已停止
     */
    @TableField(value = "crawl_is_stop")
    @ApiModelProperty(value="是否已停止更新，0：未停止，1：已停止")
    private Boolean crawlIsStop;

    public static final String COL_ID = "id";

    public static final String COL_WORK_DIRECTION = "work_direction";

    public static final String COL_CAT_ID = "cat_id";

    public static final String COL_CAT_NAME = "cat_name";

    public static final String COL_PIC_URL = "pic_url";

    public static final String COL_BOOK_NAME = "book_name";

    public static final String COL_AUTHOR_ID = "author_id";

    public static final String COL_AUTHOR_NAME = "author_name";

    public static final String COL_BOOK_DESC = "book_desc";

    public static final String COL_SCORE = "score";

    public static final String COL_BOOK_STATUS = "book_status";

    public static final String COL_VISIT_COUNT = "visit_count";

    public static final String COL_WORD_COUNT = "word_count";

    public static final String COL_COMMENT_COUNT = "comment_count";

    public static final String COL_LAST_INDEX_ID = "last_index_id";

    public static final String COL_LAST_INDEX_NAME = "last_index_name";

    public static final String COL_LAST_INDEX_UPDATE_TIME = "last_index_update_time";

    public static final String COL_IS_VIP = "is_vip";

    public static final String COL_STATUS = "status";

    public static final String COL_UPDATE_TIME = "update_time";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CRAWL_SOURCE_ID = "crawl_source_id";

    public static final String COL_CRAWL_BOOK_ID = "crawl_book_id";

    public static final String COL_CRAWL_LAST_TIME = "crawl_last_time";

    public static final String COL_CRAWL_IS_STOP = "crawl_is_stop";
}