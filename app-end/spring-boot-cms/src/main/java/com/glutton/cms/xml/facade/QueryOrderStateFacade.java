package com.glutton.cms.xml.facade;

/**
 * @Author: lijun_isf
 */
public class QueryOrderStateFacade extends SoapXmlFacade {
    @Override
    public void extendInvoke() {
        super.soapDecorate.setSoapMethodNum(SoapMethodEnum.ORDER_STATE_QUERY);
    }
}
