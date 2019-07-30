package com.glutton.cms.service.respmessage.impl;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.service.respmessage.IResponseMessage;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public class ResponseMessageImpl implements IResponseMessage {
    @Override
    public JSONObject successQuery(Object object) {
        return success("查询成功", object);
    }

    @Override
    public JSONObject successUpdate(Object object) {
        return success("修改成功", object);
    }

    @Override
    public JSONObject successDel(Object object) {
        return success("删除成功", object);
    }

    @Override
    public JSONObject success(String msg, Object object) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success", true);
        jsonObject.put("msg", msg);
        jsonObject.put("data", object);
        return jsonObject;
    }

    @Override
    public JSONObject error(String errMsg) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success", false);
        jsonObject.put("msg", errMsg);
        jsonObject.put("data", null);
        return jsonObject;
    }
}
