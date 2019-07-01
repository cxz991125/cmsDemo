package com.glutton.cms.service.account.impl;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CMSUserAccount;
import com.glutton.cms.mapping.acount.AccountMapper;
import com.glutton.cms.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Map;

/**
 * @Author: lijun_isf
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    AccountMapper accountMapper;
    @Override
    public int addAccount(CMSUserAccount cmsUserAccount) {
        int insertId = accountMapper.addAccount(cmsUserAccount);
        return insertId;
    }

    @Override
    public JSONObject doLogin(String accountName, String accountPassword) {
        CMSUserAccount userAccount = new CMSUserAccount();
        userAccount.setAccountName(accountName);
        userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(accountPassword.getBytes()));
        CMSUserAccount loginAccount = accountMapper.findAccount(userAccount);
        JSONObject rtnMsg = new JSONObject();
        if(loginAccount == null){
            rtnMsg.put("success", false);
            rtnMsg.put("message", "登陆失败！");
        }else{
            rtnMsg.put("success", true);
            rtnMsg.put("message", "登陆成功！");
            rtnMsg.put("data", loginAccount);
        }
        return rtnMsg;
    }
}
