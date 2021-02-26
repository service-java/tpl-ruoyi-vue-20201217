package com.ruoyi.common.query;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ruoyi.common.util.StringUtils;
import io.swagger.annotations.ApiParam;
import lombok.ToString;

/**
 * 分页数据
 *
 * @author ruoyi
 */
@ToString
public class PageQuery {
    /**
     * 当前记录起始索引, 默认值1
     */
    private Integer pageNum = 1;

    /**
     * 每页显示记录数, 默认值1
     */
    private Integer pageSize = 10;

    /**
     * 排序列
     */
    private String orderByColumn;

    /**
     * 排序的方向desc或者asc, 默认true
     */
    private Boolean isAsc = true;

    @JsonIgnore
    @ApiParam(hidden = true)
    private String orderBySQL;

    public String getOrderBySQL() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + (isAsc ? "" : "desc");
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    public boolean getIsAsc() {
        return isAsc;
    }

    public void setIsAsc(Boolean isAsc) {
        this.isAsc = isAsc;
    }


}
