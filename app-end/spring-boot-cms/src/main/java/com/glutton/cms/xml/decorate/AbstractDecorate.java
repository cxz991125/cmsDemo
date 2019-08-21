package com.glutton.cms.xml.decorate;

import com.glutton.cms.xml.IXmlDecorate;
import com.glutton.cms.xml.XMLBean;

/**
 * @Author: lijun_isf
 */
public abstract class AbstractDecorate implements IXmlDecorate {
    private IXmlDecorate decorate;

    public AbstractDecorate(){}


    public AbstractDecorate(IXmlDecorate xmlDecorate){
        this.decorate = xmlDecorate;
    }

    public void setDecorate(IXmlDecorate xmlDecorate){
        this.decorate = xmlDecorate;
    }
    @Override
    public String xmlString(XMLBean xmlBean) {
        return decorate == null? joinStr(xmlBean.xmlStr()): joinStr(decorate.xmlString(xmlBean));
    }

    abstract String joinStr(String xmlString);
}
