package com.glutton.cms.xml.decorate;

import com.glutton.cms.xml.IXmlDecorate;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;

/**
 * @Author: lijun_isf
 */
public class VersionDecorate extends AbstractDecorate{

    public VersionDecorate(){}

    public VersionDecorate(IXmlDecorate decorate){
        super(decorate);
    }

    @Override
    String joinStr(String xmlString) {
        Document doc = DocumentHelper.createDocument();
        return doc.asXML() + xmlString;
    }
}
