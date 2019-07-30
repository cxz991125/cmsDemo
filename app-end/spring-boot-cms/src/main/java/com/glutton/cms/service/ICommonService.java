package com.glutton.cms.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public interface ICommonService<T> {

    JSONObject insert(T t);
    JSONObject delete(long id);
    JSONObject modify(T t);
    JSONObject selectById(long id);
    JSONObject selectList(T t);

}
