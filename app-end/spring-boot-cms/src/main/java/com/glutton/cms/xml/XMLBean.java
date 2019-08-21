package com.glutton.cms.xml;

import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class XMLBean {
    private static final String ROOT_NODE = "ROOT";
    private String nodeId;
    //默认值为空，避免dom4j处理出错
    private String nodeValue = "";
    private Map<String, Object> nodeMap = new LinkedHashMap<>();
    public XMLBean(){}
    public XMLBean(String nodeId){
        this.nodeId = nodeId;
    }

    public  static XMLBean rootXml(){
        return new XMLBean(ROOT_NODE);
    }
    public XMLBean(String nodeId, String nodeValue){
        this.nodeId = nodeId;
        this.nodeValue = nodeValue==null?"":nodeValue;
    }
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        if(nodeValue != null){
            this.nodeValue = nodeValue;
        }
    }

    public void addChildNode(String nodeId, Object nodeValue){
        nodeMap.put(nodeId, nodeValue==null?"":nodeValue);
    }

    public void addChildNode(XMLBean child){
        nodeMap.put(child.getNodeId(), child);
    }
    public Map<String, Object> getNodes(){
        return nodeMap;
    }

    public Element createElement(){
        return createElement(this);
    }
    public static Element createElement(XMLBean xmlBean){
        Element parentEle = DocumentHelper.createElement(xmlBean.getNodeId());
        parentEle.addText(xmlBean.getNodeValue());
        for(Map.Entry<String, Object> entry : xmlBean.getNodes().entrySet()){
            if(entry.getValue() instanceof XMLBean){
                Element childNodes = createElement((XMLBean) entry.getValue());
                parentEle.add(childNodes);
            }else if(entry.getValue() instanceof List){
                for(XMLBean bean : (List<XMLBean>)entry.getValue()){
                    parentEle.add(bean.createElement());
                }
            }else{
                Element childEle = parentEle.addElement(entry.getKey());
                childEle.addText(String.valueOf(entry.getValue()));
            }
        }
        return parentEle;
    }

    public String xmlStr(){
        return this.createElement().asXML();
    }

    @Override
    public String toString() {
        return this.nodeId + ":" + this.nodeValue;
    }
}
