package com.glutton.cms.xml.facade;

/**
 * @Author: lijun_isf
 */
public class WoReceiveSoapFacade extends SoapXmlFacade{
    @Override
    public void extendInvoke() {
        super.soapDecorate.setSoapMethodNum(SoapMethodEnum.WO_RECEIVE);
    }
}
