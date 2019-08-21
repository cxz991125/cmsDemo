package com.glutton.cms.xml.decorate;

import com.glutton.cms.xml.IXmlDecorate;
import com.glutton.cms.xml.facade.SoapMethodEnum;

/**
 * @Author: lijun_isf
 */
public class SoapDecorate extends AbstractDecorate {
    private static final String PRE_STR = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:crm=\"http://pboss.server.iwhale.com/\"><soapenv:Header/><soapenv:Body><crm:%s><requestXml>";
    private static final String AFTER_STR = "</requestXml></crm:%s></soapenv:Body></soapenv:Envelope>";
    private SoapMethodEnum soapMethodEnum;
    public  SoapDecorate(){}

    public SoapDecorate(IXmlDecorate decorate){
        super(decorate);
    }

    public SoapDecorate(IXmlDecorate decorate, SoapMethodEnum soapMethodEnum){
        super(decorate);
        this.soapMethodEnum = soapMethodEnum;
    }

    public void setSoapMethodNum(SoapMethodEnum soapMethodNum){
        this.soapMethodEnum = soapMethodNum;
    }

    @Override
    public String joinStr(String str){
        return format(PRE_STR) + str + format(AFTER_STR);
    }

    private String format(String str){
        return String.format(str, soapMethodEnum.getMethodName());
    }


}
