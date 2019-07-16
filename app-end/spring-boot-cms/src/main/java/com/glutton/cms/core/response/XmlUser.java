package com.glutton.cms.core.response;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

/**
 * @Author: lijun_isf
 */
@Data
@JacksonXmlRootElement(localName = "root")
public class XmlUser {
    @JacksonXmlProperty(localName = "user-name")
    private  String userName;
    @JacksonXmlProperty(localName = "age")
    private int age;
    @JacksonXmlProperty(localName = "sex")
    private boolean sex;
}
