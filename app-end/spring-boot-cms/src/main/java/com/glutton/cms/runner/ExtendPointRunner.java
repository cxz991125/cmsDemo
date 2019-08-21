package com.glutton.cms.runner;

import com.glutton.cms.extend.ExtendManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: lijun_isf
 */
@Component
public class ExtendPointRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println(ExtendManager.INSTANCE.toString());
    }
}
