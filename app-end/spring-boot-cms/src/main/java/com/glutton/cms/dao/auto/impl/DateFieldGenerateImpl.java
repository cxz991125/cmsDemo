package com.glutton.cms.dao.auto.impl;

import com.glutton.cms.annotation.ExtendItem;
import com.glutton.cms.dao.auto.AbstractFieldGenerateExtendService;
import com.glutton.cms.dao.auto.IFieldGenerateExtendService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @Author: lijun_isf
 */
@Service
@ExtendItem
public class DateFieldGenerateImpl extends AbstractFieldGenerateExtendService implements IFieldGenerateExtendService {
    private String [] types = {"datetime", "timestamp"};
    @Override
    public boolean isFieldType(String type) {
        return Arrays.asList(types).contains(type);
    }

    @Override
    public String id() {
        return "Date";
    }

    @Override
    public String name() {
        return "时间类型";
    }
}
