package com.glutton.cms.controller.category;

import com.alibaba.fastjson.JSONObject;
import com.glutton.cms.dao.category.Category;
import com.glutton.cms.service.category.ICategoryService;
import com.glutton.cms.service.respmessage.IResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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
    public JSONObject addCategory(@RequestBody Category category){
        category.setcCreateTime(new Date());
        long categoryId = categoryService.addCategory(category);
        return rtnMsg.success("添加成功！", categoryId);
    }
    @RequestMapping("/list")
    public JSONObject categories(@RequestParam int parentId){
        List<Category> list =  categoryService.categories(parentId);
        return rtnMsg.success("查询成功！", list);
    }
}
