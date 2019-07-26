package com.glutton.cms.runner;

import com.glutton.cms.dao.person.CmsUserAccount;
import com.glutton.cms.mapping.person.CmsUserAccountMapper;
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
    CmsUserAccountMapper accountMapper;
    @Override
    public void run(String... args) throws Exception {
        CmsUserAccount userAccount  = new CmsUserAccount();
        String loginName = "admin";
        userAccount.setAccountName(loginName);
        userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(loginName.getBytes()));
        CmsUserAccount admAccount = accountMapper.findAccount(userAccount);
        if(admAccount == null){
            userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(loginName.getBytes()));
            userAccount.setUserId(0L);
            accountMapper.insert(userAccount);
        }
    }
}
