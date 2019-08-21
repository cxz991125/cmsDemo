package com.glutton.cms.xml.decorate;

import com.glutton.cms.xml.IXmlDecorate;
import org.dom4j.DocumentHelper;

/**
 * @Author: lijun_isf
 */
public class CDataDecorate extends AbstractDecorate {

    public CDataDecorate(){

    }

    public  CDataDecorate (IXmlDecorate decorate){
        super(decorate);
    }
    @Override
    String joinStr(String xmlString) {
        return DocumentHelper.createCDATA(xmlString).asXML();
    }
}
