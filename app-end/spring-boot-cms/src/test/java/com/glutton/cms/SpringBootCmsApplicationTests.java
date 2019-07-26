package com.glutton.cms;

import com.glutton.cms.dao.auto.FieldGenerateManage;
import com.glutton.cms.dao.category.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCmsApplicationTests {
    @Autowired
    FieldGenerateManage fieldGenerateManage;
    @Test
    public void contextLoads() throws IOException {
        fieldGenerateManage.generate(Category.class);
    }
}
