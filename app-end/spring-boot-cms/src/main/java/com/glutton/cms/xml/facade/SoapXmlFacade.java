package com.glutton.cms.xml.facade;

import com.glutton.cms.xml.XMLBean;
import com.glutton.cms.xml.decorate.CDataDecorate;
import com.glutton.cms.xml.decorate.SoapDecorate;
import com.glutton.cms.xml.decorate.VersionDecorate;

/**
 * @Author: lijun_isf
 */
public abstract class SoapXmlFacade implements IXmlFacade {
    protected SoapDecorate soapDecorate;
    protected CDataDecorate cDataDecorate;
    protected VersionDecorate versionDecorate;

    public SoapXmlFacade(){
        soapDecorate = new SoapDecorate();
        cDataDecorate = new CDataDecorate();
        versionDecorate = new VersionDecorate();
    }

    @Override
    public String generate(XMLBean xmlBean) {
        extendInvoke();
        soapDecorate.setDecorate(cDataDecorate);
        cDataDecorate.setDecorate(versionDecorate);
        return soapDecorate.xmlString(xmlBean);
    }

    public  abstract void extendInvoke();

}
