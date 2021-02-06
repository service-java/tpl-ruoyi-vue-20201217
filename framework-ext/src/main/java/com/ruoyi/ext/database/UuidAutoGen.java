package com.ruoyi.ext.database;

import cn.hutool.core.util.IdUtil;
import org.beetl.sql.core.IDAutoGen;

/**
 * beetl uuid生成
 *
 * @author admin
 */
public class UuidAutoGen implements IDAutoGen<String> {
    public String nextID(String params) {
        return IdUtil.randomUUID();
    }

}
