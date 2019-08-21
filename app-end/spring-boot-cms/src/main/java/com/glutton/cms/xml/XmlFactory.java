package com.glutton.cms.xml;

import com.glutton.cms.xml.facade.EnableXmlFacade;
import com.glutton.cms.xml.facade.IXmlFacade;
import com.glutton.cms.xml.facade.QueryOrderStateFacade;
import com.glutton.cms.xml.facade.WoReceiveSoapFacade;

/**
 * @Author: lijun_isf
 */
public class XmlFactory {


    public static String woReceive(XMLBean xmlBean){
        IXmlFacade facade = new WoReceiveSoapFacade();
        return facade.generate(xmlBean);
    }


    public static String queryOrderState(XMLBean xmlBean){
        IXmlFacade facade = new QueryOrderStateFacade();
        return facade.generate(xmlBean);
    }


    public static String enablerXml(XMLBean xmlBean){
        IXmlFacade facade = new EnableXmlFacade();
        return facade.generate(xmlBean);
    }

}
