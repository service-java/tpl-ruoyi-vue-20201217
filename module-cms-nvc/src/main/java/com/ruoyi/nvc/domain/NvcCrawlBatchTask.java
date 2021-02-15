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
    * 批量抓取任务表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcCrawlBatchTask")
@Data
@TableName(value = "nvc_crawl_batch_task")
public class NvcCrawlBatchTask {
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
     * 成功抓取数量
     */
    @TableField(value = "crawl_count_success")
    @ApiModelProperty(value="成功抓取数量")
    private Integer crawlCountSuccess;

    /**
     * 目标抓取数量
     */
    @TableField(value = "crawl_count_target")
    @ApiModelProperty(value="目标抓取数量")
    private Integer crawlCountTarget;

    /**
     * 任务状态，1：正在运行，0已停止
     */
    @TableField(value = "task_status")
    @ApiModelProperty(value="任务状态，1：正在运行，0已停止")
    private Boolean taskStatus;

    /**
     * 任务开始时间
     */
    @TableField(value = "start_time")
    @ApiModelProperty(value="任务开始时间")
    private Date startTime;

    /**
     * 任务结束时间
     */
    @TableField(value = "end_time")
    @ApiModelProperty(value="任务结束时间")
    private Date endTime;

    public static final String COL_ID = "id";

    public static final String COL_SOURCE_ID = "source_id";

    public static final String COL_CRAWL_COUNT_SUCCESS = "crawl_count_success";

    public static final String COL_CRAWL_COUNT_TARGET = "crawl_count_target";

    public static final String COL_TASK_STATUS = "task_status";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";
}