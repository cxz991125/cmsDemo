package com.glutton.cms.service.account;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CMSUserAccount;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: lijun_isf
 */
@Service
public interface IAccountService {
    public int addAccount(CMSUserAccount cmsUserAccount);

    public JSONObject doLogin(String accountName, String accountPassword);
}
