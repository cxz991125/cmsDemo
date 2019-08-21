package com.glutton.cms.dao.auto;

import com.glutton.cms.annotation.ExtendPoint;
import com.glutton.cms.extend.IExtend;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
@ExtendPoint
public interface IFieldGenerateExtendService extends IExtend {

    boolean isFieldType(String type);
    String generateField(String fieldName);
    String generateGet(String fieldName);
    String generateSet(String fieldName);
}
