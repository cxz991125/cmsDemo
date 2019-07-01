package com.glutton.cms.service.login.impl;

import com.glutton.cms.dao.person.CMSUser;
import com.glutton.cms.mapping.acount.UserMapper;
import com.glutton.cms.service.login.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Service
public class LoginService implements ILoginService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<CMSUser> findUserList(){
        return userMapper.findUsers();
    }
}
