package com.ruoyi.ext.util;

import org.beetl.core.Context;
import org.beetl.core.Function;

public class IsEmptyObj implements Function {
    @Override
    public Boolean call(Object[] paras, Context ctx) {
        Object o = paras[0];
        if (o == null) {
            return true;
        }
        if ((o instanceof String)) {
            String cs = (String) o;
            return cs.trim().length() == 0;

        }
        return false;
    }
}
