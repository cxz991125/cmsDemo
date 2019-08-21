package com.glutton.cms.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectUtil {
    public static Method getMethod(Class clazz, String methodName) {
        return method(clazz, "get"+CharacterUtil.upperFirstCharacter(methodName));

    }

    public static Field hasFiled(Class clazz, String fieldName){
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            if(field.getName().equals(fieldName)){
                return field;
            }
        }
        return null;
    }

    public static Method setMethod(Class clazz, String methodName, Class<?>...paramTypes) {
        return method(clazz,"set"+CharacterUtil.upperFirstCharacter(methodName), paramTypes);
    }

    public static Method method(Class clazz, String methodName, Class<?>...paramTypes){
        try{
            return  clazz.getMethod(methodName, paramTypes);
        }catch(Exception e){
            return null;
        }
    }
}
