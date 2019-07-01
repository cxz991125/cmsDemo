package com.glutton.cms.runner;

import com.glutton.cms.dao.person.CMSUserAccount;
import com.glutton.cms.mapping.acount.AccountMapper;
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
    AccountMapper accountMapper;
    @Override
    public void run(String... args) throws Exception {
        CMSUserAccount userAccount  = new CMSUserAccount();
        String loginName = "admin";
        userAccount.setAccountName(loginName);
        accountMapper.findAccount(userAccount);
        if(userAccount == null){
            userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(loginName.getBytes()));
            userAccount.setUserId(0);
            accountMapper.addAccount(userAccount);
        }
    }
}
