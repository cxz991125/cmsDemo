package com.glutton.cms.mapping.category;

import com.glutton.cms.dao.category.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: lijun_isf
 */
@Mapper
public interface CategoryMapper {

    public void add(Category category);
    public void delete(int cId);
    public void modify(Category category);
    public Category select();
}
