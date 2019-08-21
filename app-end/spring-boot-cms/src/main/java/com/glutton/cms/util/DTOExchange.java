package com.glutton.cms.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DTOExchange {

    public static void exChange(Object dest, Object source) throws InvocationTargetException, IllegalAccessException {
        Class sourceClass = source.getClass();
        Class destClass = dest.getClass();
        Field[] destFields = destClass.getDeclaredFields();
        for(Field field : destFields){
            String fieldName = field.getName();
            Method sourceGetMethod = ReflectUtil.getMethod(sourceClass, fieldName);
            if(sourceGetMethod==null){
                continue;
            }
            Object getValue = sourceGetMethod.invoke(source);
            if(getValue == null){
                continue;
            }
            Method destSetMethod = ReflectUtil.setMethod(destClass, fieldName, getValue.getClass());
            if(destSetMethod!=null ){
                destSetMethod.invoke(dest, getValue);
            }
        }
    }


}
