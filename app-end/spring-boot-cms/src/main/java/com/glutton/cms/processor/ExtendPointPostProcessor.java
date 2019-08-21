package com.glutton.cms.processor;

import com.glutton.cms.annotation.ExtendItem;
import com.glutton.cms.annotation.ExtendPoint;
import com.glutton.cms.extend.ExtendManager;
import com.glutton.cms.extend.IExtend;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

/**
 * @Author: lijun_isf
 */
@Component
public class ExtendPointPostProcessor implements BeanPostProcessor {
    private ExtendManager extendManager = ExtendManager.INSTANCE;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class clazz = bean.getClass();
        Annotation annotations = clazz.getAnnotation(ExtendPoint.class);
        if (annotations != null) {
            extendManager.addExtend((IExtend) bean);
            return bean;
        }
        Annotation extendItem = clazz.getAnnotation(ExtendItem.class);
        clazz.getAnnotation(Service.class);
        if(extendItem == null){
            return bean;
        }
        Class[] interClass = clazz.getInterfaces();
        int len = interClass.length;
        for (int i = 0; i < len; i++) {
            Class inter = interClass[i];
            extendManager.putExtendItem(inter.getName(), (IExtend) bean);
        }
        return bean;
    }
}
