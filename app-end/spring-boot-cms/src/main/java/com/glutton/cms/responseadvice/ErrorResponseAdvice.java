package com.glutton.cms.responseadvice;

import com.glutton.cms.message.RtnMsgBean;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * @Author: lijun_isf
 */
@ControllerAdvice
public class ErrorResponseAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public RtnMsgBean exception(Exception e){
        e.printStackTrace();
        RtnMsgBean rtnMsgBean = RtnMsgBean.newInstance();
        rtnMsgBean.error(-1, e.getMessage());
        return  rtnMsgBean;
    }
}
