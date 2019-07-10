package com.glutton.cms.config;

import com.glutton.cms.dao.auto.config.GenerateFileConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: lijun_isf
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableConfigurationProperties(GenerateFileConfig.class)
public class GenerateFileConfigTest {
    @Autowired
    GenerateFileConfig fileConfig;
    @Test
    public void testAutoConfig(){
        System.out.println(fileConfig.getPackageName());
        System.out.println(fileConfig.isAbsolute());

    }
}
