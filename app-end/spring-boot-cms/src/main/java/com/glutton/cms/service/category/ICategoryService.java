package com.glutton.cms.service.category;

import com.glutton.cms.dao.category.Category;

import java.util.List;

/**
 * @Author: lijun_isf
 */
public interface ICategoryService {

    public long addCategory(Category category);

    public List<Category> categories(int pId);
}
