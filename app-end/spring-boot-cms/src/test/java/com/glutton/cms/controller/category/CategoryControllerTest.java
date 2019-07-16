package com.glutton.cms.controller.category;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author: lijun_isf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryControllerTest {
    @Autowired
    CategoryController categoryController;
    @Test
    public void addCategoryTest(){
        JSONObject json = new JSONObject();
        json.put("parentId", 0);
        json.put("cName", "首页");
        json.put("cCreateTime", new Date());
        json.put("cOrder", 0);
        json.put("cAliase", "main");
        /*JSONObject rtnMsg = categoryController.addCategory(json);
        Assert.assertEquals(true, rtnMsg.getBoolean("success"));*/

    }
}
