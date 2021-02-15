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
    * 抓取单本小说任务表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcCrawlSingleTask")
@Data
@TableName(value = "nvc_crawl_single_task")
public class NvcCrawlSingleTask {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 爬虫源ID
     */
    @TableField(value = "source_id")
    @ApiModelProperty(value="爬虫源ID")
    private Integer sourceId;

    /**
     * 源站小说ID
     */
    @TableField(value = "source_book_id")
    @ApiModelProperty(value="源站小说ID")
    private String sourceBookId;

    /**
     * 任务状态，0：失败，1：成功，2；未执行
     */
    @TableField(value = "task_status")
    @ApiModelProperty(value="任务状态，0：失败，1：成功，2；未执行")
    private Boolean taskStatus;

    /**
     * 已经执行次数，最多执行5次
     */
    @TableField(value = "exc_count")
    @ApiModelProperty(value="已经执行次数，最多执行5次")
    private Byte excCount;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    public static final String COL_ID = "id";

    public static final String COL_SOURCE_ID = "source_id";

    public static final String COL_SOURCE_BOOK_ID = "source_book_id";

    public static final String COL_TASK_STATUS = "task_status";

    public static final String COL_EXC_COUNT = "exc_count";

    public static final String COL_CREATE_TIME = "create_time";
}