package com.glutton.cms.extend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: lijun_isf
 */
public enum  ExtendManager {
    /**
     * 单例
     */
    INSTANCE;
    /**
     * 扩展点List集合
     */
    private List<IExtend> extendPointList;
    /**
     * 扩展点的Map集合
     */
    private Map<String, List<IExtend>> extendItemMap;

    ExtendManager(){
        extendPointList = new ArrayList<>(10);
        extendItemMap = new HashMap<>(10);
    }

    public void addExtend(IExtend extend){
        extendPointList.add(extend);
    }

    public void putExtendItem(String pointPackageName, IExtend extend){
        if(extendItemMap.containsKey(pointPackageName)){
            extendItemMap.get(pointPackageName).add(extend);
        }else{
            List<IExtend> itemList = new ArrayList<>();
            itemList.add(extend);
            extendItemMap.put(pointPackageName, itemList);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String, List<IExtend>> entry : extendItemMap.entrySet()){
            sb.append("{").append(entry.getKey()).append(entry.getValue()).append("},");
        }
        return sb.toString();
    }
}
