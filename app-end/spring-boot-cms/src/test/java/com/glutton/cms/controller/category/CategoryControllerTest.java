package com.glutton.cms.controller.category;

import com.glutton.cms.service.category.ICategoryService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * @Author: lijun_isf
 *
 * https://spring.io/guides/gs/testing-web/
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CategoryControllerTest {
    @Autowired
    CategoryController categoryController;
    @Autowired
    WebApplicationContext webApplicationContext;
    @Autowired
    ICategoryService categoryService;
    private MockMvc mockMvc;

    @Before
    public void setMockMvc() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void addCategoryTest() {
        /*JSONObject json = new JSONObject();
        json.put("parentId", 0);
        json.put("cName", "首页");
        json.put("cCreateTime", new Date());
        json.put("cOrder", 0);
        json.put("cAliase", "main");
        JSONObject rtnMsg = categoryController.addCategory(json);
        Assert.assertEquals(true, rtnMsg.getBoolean("success"));*/
    }

    @Test
    public void testCategoryList() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/category/list")
                                                .param("parentId", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value(0))
                .andExpect(jsonPath("$.data").isNotEmpty())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

    @Test
    public void testError() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/category/error"))
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }

}
