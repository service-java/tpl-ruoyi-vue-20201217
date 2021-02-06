package com.ruoyi.mall.controller;

import com.ruoyi.common.util.DateUtils;
import com.ruoyi.mall.security.SecurityUtils;
import com.ruoyi.mall.security.login.LoginUser;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 * web层通用数据处理
 *
 * @author ruoyi
 */
public class BaseController {

    /**
     * 将前台传递过来的日期格式的字符串，自动转化为Date类型
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // Date 类型转换
        binder.registerCustomEditor(Date.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String text) {
                setValue(DateUtils.parseDate(text));
            }
        });
    }

    protected LoginUser getUser() {
        return SecurityUtils.getLoginUser();
    }

    protected Long getUserId() {
        return getUser().getUser().getUserId();
    }


}
