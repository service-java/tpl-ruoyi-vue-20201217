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
    * 爬虫源表
    */
@ApiModel(value="com-ruoyi-nvc-domain-NvcCrawlSource")
@Data
@TableName(value = "nvc_crawl_source")
public class NvcCrawlSource {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 源站名
     */
    @TableField(value = "source_name")
    @ApiModelProperty(value="源站名")
    private String sourceName;

    /**
     * 爬取规则（json串）
     */
    @TableField(value = "crawl_rule")
    @ApiModelProperty(value="爬取规则（json串）")
    private String crawlRule;

    /**
     * 爬虫源状态，0：关闭，1：开启
     */
    @TableField(value = "source_status")
    @ApiModelProperty(value="爬虫源状态，0：关闭，1：开启")
    private Boolean sourceStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 更新时间
     */
    @TableField(value = "update_time")
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    public static final String COL_ID = "id";

    public static final String COL_SOURCE_NAME = "source_name";

    public static final String COL_CRAWL_RULE = "crawl_rule";

    public static final String COL_SOURCE_STATUS = "source_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_UPDATE_TIME = "update_time";
}