package com.glutton.cms.mapping.acount;

import com.glutton.cms.dao.person.CMSUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Mapper
public interface UserMapper {
    /**
     * @return CMSUser列表
     *
     */
    List<CMSUser> findUsers();
}
