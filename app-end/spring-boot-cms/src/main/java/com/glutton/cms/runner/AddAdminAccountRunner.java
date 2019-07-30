package com.glutton.cms.runner;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CmsUserAccount;
import com.glutton.cms.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * @Author: lijun_isf
 */
@Component
public class AddAdminAccountRunner implements CommandLineRunner {
    @Autowired
    IAccountService accountService;
    @Override
    public void run(String... args) {

        String loginName = "admin";
        JSONObject admAccount = accountService.doLogin(loginName,loginName);
        if(!admAccount.getBoolean("success")){
            CmsUserAccount userAccount  = new CmsUserAccount();
            userAccount.setAccountName(loginName);
            userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(loginName.getBytes()));
            userAccount.setUserId(0L);
            accountService.addAccount(userAccount);
        }
    }
}
