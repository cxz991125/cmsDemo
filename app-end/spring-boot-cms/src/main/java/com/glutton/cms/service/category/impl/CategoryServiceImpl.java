package com.glutton.cms.service.category.impl;

import com.glutton.cms.dao.category.Category;
import com.glutton.cms.mapping.category.CategoryMapper;
import com.glutton.cms.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    CategoryMapper categoryMapper;
    @Override
    public long addCategory(Category category) {
        categoryMapper.insertSelective(category);
        return category.getcId();
    }

    @Override
    public List<Category> categories(int pId) {
        Example categoryExample = new Example(Category.class);
        Example.Criteria criteria = categoryExample.createCriteria();
        criteria.andEqualTo("parentId",pId);
        return categoryMapper.selectByExample(categoryExample);
    }

}
