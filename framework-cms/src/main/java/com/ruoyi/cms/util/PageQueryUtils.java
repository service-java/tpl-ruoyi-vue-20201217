package com.ruoyi.cms.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.common.query.PageQuery;
import com.ruoyi.common.xss.SQLFilter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

/**
 * 查询参数
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
public class PageQueryUtils<T> {

    public IPage<T> convertIPage(PageQuery pageQuery) {
        return this.convertIPage(pageQuery, null, true);
    }

    public IPage<T> convertIPage(PageQuery pageQuery, String defaultOrderField, boolean isAsc) {

        //分页对象
        Page<T> page = new Page<>(pageQuery.getPageNum(), pageQuery.getPageSize());

        // 排序字段
        // 防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String orderField = SQLFilter.sqlInject(pageQuery.getOrderByColumn());

        // 前端字段排序
        if(StringUtils.isNotEmpty(orderField)){
            if(pageQuery.getIsAsc() == true) {
                return page.addOrder(OrderItem.asc(orderField));
            }else {
                return page.addOrder(OrderItem.desc(orderField));
            }
        }

        // 没有排序字段，则不排序
        if(StringUtils.isBlank(defaultOrderField)){
            return page;
        }

        //默认排序
        if(isAsc) {
            page.addOrder(OrderItem.asc(defaultOrderField));
        }else {
            page.addOrder(OrderItem.desc(defaultOrderField));
        }

        return page;
    }

}
