package com.ruoyi.common.vo;

import com.ruoyi.common.query.PageQuery;
import com.ruoyi.common.util.ServletUtils;
import com.ruoyi.common.util.text.Convert;

/**
 * 表格数据处理
 *
 * @author ruoyi
 */
public class TableDataUtils {
    /**
     * 当前记录起始索引
     */
    public static final String PAGE_NUM = "pageNum";

    /**
     * 每页显示记录数
     */
    public static final String PAGE_SIZE = "pageSize";

    /**
     * 排序列
     */
    public static final String ORDER_BY_COLUMN = "orderByColumn";

    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    public static final String IS_ASC = "isAsc";

    /**
     * 封装分页对象
     */
    public static PageQuery getPageDomain() {
        PageQuery pageDomain = new PageQuery();
        pageDomain.setPageNum(ServletUtils.getParameterToInt(PAGE_NUM));
        pageDomain.setPageSize(ServletUtils.getParameterToInt(PAGE_SIZE));
        pageDomain.setOrderByColumn(ServletUtils.getParameter(ORDER_BY_COLUMN));
        pageDomain.setIsAsc(Convert.toBool(ServletUtils.getParameter(IS_ASC)));
        return pageDomain;
    }

    public static PageQuery buildPageRequest() {
        return getPageDomain();
    }
}
