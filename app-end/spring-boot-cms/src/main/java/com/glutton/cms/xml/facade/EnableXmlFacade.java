package com.glutton.cms.xml.facade;

import com.glutton.cms.xml.XMLBean;
import com.glutton.cms.xml.decorate.VersionDecorate;

/**
 * @Author: lijun_isf
 */
public class EnableXmlFacade implements IXmlFacade {
    //private BraceDecorate brace;
    private VersionDecorate version;

    public EnableXmlFacade(){
       // brace = new BraceDecorate();
        version = new VersionDecorate();
    }

    @Override
    public String generate(XMLBean xmlBean) {
       // brace.setDecorate(version);
        return version.xmlString(xmlBean);
    }
}
