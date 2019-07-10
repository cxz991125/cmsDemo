package com.glutton.cms.dao.auto;

import com.glutton.cms.extend.IExtend;

import java.io.IOException;

/**
 * @Author: lijun_isf
 */
public interface IGenerateExtendService extends IExtend {

    public void generateFile() throws IOException;
}
