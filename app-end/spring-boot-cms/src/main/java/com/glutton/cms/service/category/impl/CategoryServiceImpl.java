package com.glutton.cms.service.category.impl;

import com.glutton.cms.dao.category.Category;
import com.glutton.cms.mapping.category.CategoryMapper;
import com.glutton.cms.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lijun_isf
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public long addCategory(Category category) {
        categoryMapper.add(category);
        return category.getcId();
    }
}
