package com.glutton.cms.service.login;

import com.glutton.cms.dao.person.CmsUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Service
public interface ILoginService {
     List<CmsUser> findUserList();
}
