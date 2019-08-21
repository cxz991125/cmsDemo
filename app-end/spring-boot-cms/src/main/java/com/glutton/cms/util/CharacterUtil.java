package com.glutton.cms.util;

import com.alibaba.druid.util.StringUtils;

public class CharacterUtil {

    /**
     * 字符串首字母
     * @param str
     * @return
     */
    public static String upperFirstCharacter(String str){
        if(Character.isUpperCase(str.charAt(0))){
            return str;
        }else{
            StringBuffer sb = new StringBuffer();
            return sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).toString();
        }
    }

    public static String lowerFirstCharacter(String str){
        if(Character.isLowerCase(str.charAt(0))){
            return str;
        }else{
            StringBuffer sb = new StringBuffer();
            return sb.append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
        }
    }

    /**
     * 将下划线的字符串转换成下划线后字母大写的字符串：a_b_c => aBC
     * @param str
     * @return
     */
    public static String upperUndelineFirstCharacter(String str){
        if(StringUtils.isEmpty(str) || !str.contains("_")){
            return str;
        }
        String[] chars = str.split("_");
        StringBuffer sb = new StringBuffer(chars[0]);
        for(int i=1;i<chars.length;i++){
            sb.append(upperFirstCharacter(chars[i]));
        }
        return sb.toString();
    }
}
