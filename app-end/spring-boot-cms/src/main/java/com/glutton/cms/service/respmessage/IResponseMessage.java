package com.glutton.cms.service.respmessage;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public interface IResponseMessage {

    public JSONObject success(String msg, Object object);
    public JSONObject error(String errMsg);
}
