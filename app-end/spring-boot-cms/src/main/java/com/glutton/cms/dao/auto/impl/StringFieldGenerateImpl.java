package com.glutton.cms.dao.auto.impl;

import com.glutton.cms.annotation.ExtendItem;
import com.glutton.cms.dao.auto.AbstractFieldGenerateExtendService;
import com.glutton.cms.dao.auto.IFieldGenerateExtendService;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
@ExtendItem
public class StringFieldGenerateImpl extends AbstractFieldGenerateExtendService implements IFieldGenerateExtendService {
    private static final String COLUMN_TYPE = "varchar";
    @Override
    public String id() {
        return "String";
    }

    @Override
    public String name() {
        return "字符串";
    }

    @Override
    public boolean isFieldType(String type) {
        return COLUMN_TYPE.equals(type);
    }

    public static void main(String[] args) {
        String str = "aaa%saa";
        String param = "--------";
        System.out.println(String.format(str, param));
    }
}
