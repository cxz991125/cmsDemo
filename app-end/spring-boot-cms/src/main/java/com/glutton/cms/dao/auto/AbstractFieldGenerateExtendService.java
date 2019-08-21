package com.glutton.cms.dao.auto;

import com.glutton.cms.util.HumpUtil;

/**
 * @Author: lijun_isf
 */

public abstract class AbstractFieldGenerateExtendService implements IFieldGenerateExtendService {

    @Override
    public String generateField(String fieldName) {
        String field = "private " + id() + " %s;";
        return String.format(field, HumpUtil.underlineToUpper(fieldName));
    }

    @Override
    public String generateGet(String fieldName) {
        String getMethodStr = "public " + id() + " get%s(){\n return this.%s;\n}";
        String humpField = HumpUtil.underlineToUpper(fieldName);
        return String.format(getMethodStr, HumpUtil.upperFirstCharactor(humpField), humpField);
    }

    @Override
    public String generateSet(String fieldName) {
        String humpField = HumpUtil.underlineToUpper(fieldName);
        String setMethodStr = "public void set%s(" + id() + " %s){\n this.%s = %s;\n}";
        return String.format(setMethodStr, HumpUtil.upperFirstCharactor(humpField), humpField, humpField, humpField);
    }


}
