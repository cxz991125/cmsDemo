package com.glutton.cms.service.account;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CmsUserAccount;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public interface IAccountService {
    public int addAccount(CmsUserAccount cmsUserAccount);

    public JSONObject doLogin(String accountName, String accountPassword);
}
