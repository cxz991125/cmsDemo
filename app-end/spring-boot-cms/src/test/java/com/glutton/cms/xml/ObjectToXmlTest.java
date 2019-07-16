package com.glutton.cms.xml;

import com.glutton.cms.core.response.XmlUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lijun_isf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectToXmlTest {
    @Test
    public void objectToXml(){
        XmlUser user = new XmlUser();
        user.setUserName("xmluser");
        user.setSex(false);
        user.setAge(10);
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        //builder.build()

    }
}
