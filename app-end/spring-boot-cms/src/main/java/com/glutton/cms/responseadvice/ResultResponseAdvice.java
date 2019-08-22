package com.glutton.cms.responseadvice;

import com.glutton.cms.message.RtnMsgBean;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @Author: lijun_isf
 */
@ControllerAdvice
public class ResultResponseAdvice implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        if(methodParameter.hasMethodAnnotation(ExceptionHandler.class)){
            return false;
        }
        return methodParameter.hasMethodAnnotation(ResponseBody.class);
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        RtnMsgBean rtnMsgBean = RtnMsgBean.newInstance();
        rtnMsgBean.success(o);
        return rtnMsgBean;
    }
}
