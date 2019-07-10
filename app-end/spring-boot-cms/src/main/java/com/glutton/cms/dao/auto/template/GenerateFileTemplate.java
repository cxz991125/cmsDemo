package com.glutton.cms.dao.auto.template;

import com.glutton.cms.dao.auto.IGenerateExtendService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

/**
 * @Author: lijun_isf
 */
@Component
public class GenerateFileTemplate implements IGenerateExtendService {
    private Path fileName;

    @Override
    public void generateFile() throws IOException {
        if(fileName.isAbsolute()){
            Files.createDirectories(fileName, null);
        }
    }

    @Override
    public String id() {
        return "GenerateFile";
    }

    @Override
    public String name() {
        return "生成文件";
    }
}
