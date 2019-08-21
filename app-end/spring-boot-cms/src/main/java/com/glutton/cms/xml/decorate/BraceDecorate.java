package com.glutton.cms.xml.decorate;

/**
 * @Author: lijun_isf
 */
public class BraceDecorate extends AbstractDecorate {

    @Override
    String joinStr(String xmlString) {
        return "{"+xmlString+"}";
    }
}
