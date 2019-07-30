package com.glutton.cms.service.category;

import com.glutton.cms.dao.category.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lijun_isf
 */
@Service
public interface ICategoryService {

    long addCategory(Category category);

    List<Category> categories(int pId);


}
