package com.glutton.cms.mapping.category;

import com.glutton.cms.dao.category.Category;
import com.glutton.cms.mapping.IBaseTableMapping;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper extends IBaseTableMapping<Category> {
}