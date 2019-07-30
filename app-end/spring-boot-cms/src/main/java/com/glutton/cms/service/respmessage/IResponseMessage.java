package com.glutton.cms.service.respmessage;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public interface IResponseMessage {
    JSONObject successQuery(Object object);
    JSONObject successUpdate(Object object);
    JSONObject successDel(Object object);
    JSONObject success(String msg, Object object);
    JSONObject error(String errMsg);
}
