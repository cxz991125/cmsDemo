package com.glutton.cms.controller.account;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.core.response.XmlUser;
import com.glutton.cms.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijun_isf
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping(value = "/doLogin", produces = MediaType.APPLICATION_JSON_VALUE)
    public JSONObject doLogin(@RequestParam String accountName, @RequestParam String accountPassword){
        return accountService.doLogin(accountName, accountPassword);
    }
    @RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public XmlUser findUser(){
        XmlUser user = new XmlUser();
        user.setAge(10);
        user.setSex(true);
        user.setUserName("glutton");
        return user;
    }

    @RequestMapping("/add")
    public JSONObject addCount(){

        return null;
    }
}
