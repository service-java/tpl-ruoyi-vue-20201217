package com.ruoyi.ext.util;

import org.beetl.sql.core.NameConversion;
import org.beetl.sql.core.UnderlinedNameConversion;

import java.util.Map;


public class BeetlsqlNameConversion extends UnderlinedNameConversion {
    NameConversion nc = null;

    public BeetlsqlNameConversion() {
        nc = new UnderlinedNameConversion();
    }


    @Override
    public String getPropertyName(String colName) {
        if ("sessionId".equalsIgnoreCase(colName)) {
            return "sessionId";
        }
        return super.getPropertyName(colName);
    }

    public String getColName(Class<?> c, String attrName) {

        if (c == null || Map.class.isAssignableFrom(c)) {
            return nc != null ? nc.getColName(attrName) : attrName;
        }

        String colName = BeetlsqlEntityHelper.getEntityTable(c, nc).getCol(attrName);
        if (colName == null) {
            colName = nc.getColName(c, attrName);
        }
        return colName;
    }
}

