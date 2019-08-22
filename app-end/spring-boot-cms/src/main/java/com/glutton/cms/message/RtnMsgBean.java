package com.glutton.cms.message;

import javax.persistence.Entity;
import java.util.HashMap;

/**
 * @Author: lijun_isf
 */
@Entity
public class RtnMsgBean {
    private int code;
    private String message;
    private  Object data;
    private RtnMsgBean(){}

    public static RtnMsgBean newInstance() {
        return new RtnMsgBean();
    }

    public void success(Object data){
        this.code = 0;
        this.message = "";
        this.data = data;
    }


    public void error(int code, String message){
        this.code = code;
        this.message = message;
        this.data = new HashMap<>(0);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
