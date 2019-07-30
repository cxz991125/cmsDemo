package com.glutton.cms.mapping.person;

import com.glutton.cms.dao.person.CmsUser;
import com.glutton.cms.mapping.IBaseTableMapping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmsUserMapper extends IBaseTableMapping<CmsUser> {
}