package com.glutton.cms.xml.facade;

/**
 * @Author: lijun_isf
 */
public enum SoapMethodEnum {
    WO_RECEIVE("woReceive"), ORDER_STATE_QUERY("orderStateQuery");

    String methodName;
    SoapMethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
