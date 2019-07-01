package com.glutton.cms.mapping.acount;

import com.glutton.cms.dao.person.CMSUserAccount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: lijun_isf
 */
@Mapper
public interface AccountMapper {

    public int addAccount(CMSUserAccount cmsUserAccount);


    public CMSUserAccount findAccount(CMSUserAccount cmsUserAccount);
}
