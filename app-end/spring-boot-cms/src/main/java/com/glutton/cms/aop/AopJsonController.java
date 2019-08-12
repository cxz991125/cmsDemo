package com.glutton.cms.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 @Author: lijun_isf
 https://www.xncoding.com/2017/07/24/spring/sb-aop.html
 */
@Component
@Aspect
public class AopJsonController {

    @Before("wrapperJsonObject()")
    public void beforeJsonObject(){

        System.out.println("-----------------controller is ask before----------------");
    }
    @Pointcut(value="execution(public * com.glutton.cms.controller..*.*(..))")
    public void wrapperJsonObject(){
        System.out.println("---------------controller is ask---------------------");
    }
    @After("wrapperJsonObject()")
    public void afterJsonObject(){
        System.out.println("---------------controller is ask after----------------");
    }

}
