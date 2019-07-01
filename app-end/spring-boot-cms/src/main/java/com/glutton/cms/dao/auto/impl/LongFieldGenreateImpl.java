package com.glutton.cms.dao.auto.impl;

import com.glutton.cms.dao.auto.AbstractFieldGenerateExtendService;
import com.glutton.cms.dao.auto.IFieldGenerateExtendService;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public class LongFieldGenreateImpl extends AbstractFieldGenerateExtendService implements IFieldGenerateExtendService {
    private static final String COLUMN_FIELD = "bigint";
    @Override
    public boolean isFieldType(String type) {
        return COLUMN_FIELD.equals(type);
    }

    @Override
    public String id() {
        return "long";
    }

    @Override
    public String name() {
        return "长整数";
    }
}
