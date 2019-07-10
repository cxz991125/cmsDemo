package com.glutton.cms.controller.category;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.category.Category;
import com.glutton.cms.service.category.ICategoryService;
import com.glutton.cms.service.respmessage.IResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijun_isf
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;
    @Autowired
    IResponseMessage rtnMsg;
    @RequestMapping("/add")
    public JSONObject addCategory(@RequestParam String categoryJson){
        Category category = JSONObject.parseObject(categoryJson, Category.class);
        categoryService.addCategory(category);
        return rtnMsg.success("添加成功！", category.getcId());
    }
}
