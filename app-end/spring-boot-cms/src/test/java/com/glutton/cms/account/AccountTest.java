package com.glutton.cms.account;

import com.glutton.cms.controller.account.AccountController;
import com.glutton.cms.dao.person.CMSUserAccount;
import com.glutton.cms.service.account.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

/**
 * @Author: lijun_isf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountTest {
    @Autowired
    private IAccountService accountService;
    @Test
    public void testAddAccount(){
        CMSUserAccount account = new CMSUserAccount();
        account.setAccountName("admin");
        account.setAccountPassword(DigestUtils.md5DigestAsHex(account.getAccountName().getBytes()));
        account.setUserId(0);
        int insertId = accountService.addAccount(account);
        System.out.println(">>>>>>>>>>>>>>>>>>>>" + account.getAccountId());
    }


}
