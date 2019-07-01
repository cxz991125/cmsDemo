package com.glutton.cms.util;

import org.springframework.util.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: lijun_isf
 * https://www.cnblogs.com/zhuhui-site/p/10090880.html
 */
public class HumpUtil {
    private final static Pattern LINE_PATTERN = Pattern.compile("_(\\w)");
    private final static Pattern UPPER_PATTERN = Pattern.compile("[A-Z]");
    public static String underlineToUpper(String input){
        input = input.toLowerCase();
        Matcher matcher = LINE_PATTERN.matcher(input);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }

    public static String upperToUnderline(String input){
        Matcher matcher = UPPER_PATTERN.matcher(input);
        StringBuffer sb = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(sb, "_" + matcher.group(1).toLowerCase());
        }
        matcher.appendTail(sb);
        return sb.toString();
    }


    public static String upperFirstCharactor(String str){
       return StringUtils.capitalize(str);
    }
}
