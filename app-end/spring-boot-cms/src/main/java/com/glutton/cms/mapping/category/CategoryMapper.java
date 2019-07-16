package com.glutton.cms.mapping.category;

import com.glutton.cms.dao.category.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Mapper
public interface CategoryMapper {

    void add(Category category);
    void delete(int cId);
    void modify(Category category);
    List<Category> select(@Param(value = "pId") int pId);
}
