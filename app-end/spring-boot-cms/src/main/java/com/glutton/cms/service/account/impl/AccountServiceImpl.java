package com.glutton.cms.service.account.impl;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.person.CmsUserAccount;
import com.glutton.cms.mapping.person.CmsUserAccountMapper;
import com.glutton.cms.service.account.IAccountService;
import com.glutton.cms.service.respmessage.IResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

/**
 * @Author: lijun_isf
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    CmsUserAccountMapper accountMapper;
    @Autowired
    IResponseMessage rtnMsg;
    @Override
    public int addAccount(CmsUserAccount cmsUserAccount) {
        int insertId = accountMapper.insertSelective(cmsUserAccount);
        return insertId;
    }

    @Override
    public JSONObject doLogin(String accountName, String accountPassword) {
        CmsUserAccount userAccount = new CmsUserAccount();
        userAccount.setAccountName(accountName);
        userAccount.setAccountPassword(DigestUtils.md5DigestAsHex(accountPassword.getBytes()));
        CmsUserAccount loginAccount = accountMapper.selectOne(userAccount);
        if(loginAccount == null){
            return rtnMsg.error("用户名或密码错误");
        }else{
            return rtnMsg.success("登陆成功！", loginAccount);
        }
    }
}
