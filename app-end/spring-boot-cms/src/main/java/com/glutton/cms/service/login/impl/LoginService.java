package com.glutton.cms.service.login.impl;

import com.glutton.cms.dao.person.CmsUser;
import com.glutton.cms.mapping.person.CmsUserMapper;
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
    CmsUserMapper userMapper;
    @Override
    public List<CmsUser> findUserList(){
        return userMapper.selectAll();
    }
}
