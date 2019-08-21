package com.glutton.cms.xml;

import com.alibaba.druid.util.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XMLUtil {
    private String xml;
    private Map<String, Object> elementMap = new HashMap<>();
    public XMLUtil(String inputXml){
        this.xml = inputXml;

    }

    /**
     * 返回指定节点的Map集合
     * @param key
     * @return
     */
    public Object elementMap(String key, Map<String, Object> map){
        if(StringUtils.isEmpty(key) || map.size()==0){
            return null;
        }
       for(Map.Entry<String, Object> entry : map.entrySet()){
           if(entry.getKey().equals(key)){
               return  entry.getValue();
           }else {
               if(entry.getValue() instanceof Map){
                   Object o = this.elementMap(key, (Map<String, Object>) entry.getValue());
                   if(o!=null){
                       return o;
                   }
               }
           }
       }

       return null;
    }

    /**
     * 返回全部节点的Map集合
     * @return
     */
    public Map<String, Object> elementMap(){
        return this.elementMap;
    }
    public void analysis() throws DocumentException {
        this.analysis(this.xml);
    }
    public void analysis(String xml) throws  DocumentException {
        SAXReader reader = new SAXReader();
        InputStream is = new ByteArrayInputStream(xml.getBytes());
        Document document = reader.read(is);
        Element root = document.getRootElement();
        Map<String, Object> map = new HashMap<>();
        map.put(root.getName(),elementToMap(root));
        this.elementMap =  map;
    }

    public Map<String, Object> elementToMap(Element root){
        List<Element> elements = root.elements();
        Map<String , Object> map = new HashMap<>();
        for(Element element : elements){
            List<Element> childElement = element.elements();
            if(childElement.size() > 0){
                map.put(element.getName(),elementToMap(element));
            }else{
                map.put(element.getName(), element.getTextTrim());
            }

        }
        return map;
    }
}
