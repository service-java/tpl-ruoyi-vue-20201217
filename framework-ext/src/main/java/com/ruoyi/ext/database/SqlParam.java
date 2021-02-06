package com.ruoyi.ext.database;

import java.util.HashMap;

public class SqlParam extends HashMap<String, Object> {

    private static final long serialVersionUID = 2639759150622783606L;

    public static final SqlParam create() {
        return new SqlParam();
    }

    public SqlParam set(String key, Object val) {
        super.put(key, val);
        return this;
    }
}
