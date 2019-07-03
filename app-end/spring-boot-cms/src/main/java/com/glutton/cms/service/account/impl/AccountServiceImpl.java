package com.glutton.cms.service.account.impl;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CMSUserAccount;
import com.glutton.cms.mapping.acount.AccountMapper;
import com.glutton.cms.service.account.IAccountService;
import com.glutton.cms.service.respmessage.IResponseMessage;
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
    @Autowired
    IResponseMessage rtnMsg;
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
        if(loginAccount == null){
            return rtnMsg.error("用户名或密码错误");
        }else{
            return rtnMsg.success("登陆成功！", loginAccount);
        }
    }
}
