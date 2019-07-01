package com.glutton.cms.dao.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.*;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lijun_isf
 */
@Component
public class FieldGenerateManage {
    @Autowired
    List<IFieldGenerateExtendService> extendServiceList;
    @Autowired
    DataSource dataSource;
    public List<IFieldGenerateExtendService> fieldGenerateExtendServices(){
        return extendServiceList;
    }

    public  IFieldGenerateExtendService getById(String fieldType){
        for(IFieldGenerateExtendService extendService : extendServiceList){
            if(extendService.isFieldType(fieldType)){
                return extendService;
            }
        }
        return null;
    }

    public File  javaFile(Class clazz) throws IOException {
        File file = new File("");
        Path projectPath = file.getCanonicalFile().toPath();
        Path mavenPath = new File("src/main/java").toPath();
        Path p = projectPath.resolve(mavenPath);
        Path javaPath = new File(clazz.getName().replace(".","\\")+".java").toPath();
        return p.resolve(javaPath).toFile();
    }

    public void generate(Class clazz) throws IOException {
        File javaFile = javaFile(clazz);
        FileReader fileReader = new FileReader(javaFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str;
        List<String> list = new ArrayList<>();
        while((str = bufferedReader.readLine())!=null){
            list.add(str);
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(javaFile));
        for (String ws : list) {
            try {
                writer.write(ws);
                writer.newLine();
                if (ws.contains("class") && ws.endsWith("{")) {
                    Connection connection = dataSource.getConnection("root", "042016");
                    PreparedStatement statement = connection.prepareStatement("select COLUMN_NAME as Field, DATA_TYPE as Type\n" +
                            "from information_schema.columns where table_name ='cms_user_account' and TABLE_SCHEMA='cms';");
                    ResultSet resultSet = statement.executeQuery();
                    StringBuffer getAndSet = new StringBuffer();
                    while (resultSet.next()) {
                        String field = resultSet.getString("Field");
                        String type = resultSet.getString("Type");
                        IFieldGenerateExtendService extendService = getById(type);
                        if(extendService == null){
                            continue;
                        }
                        writer.write(extendService.generateField(field));
                        writer.newLine();
                        getAndSet.append(extendService.generateGet(field)).append("\n");
                        getAndSet.append(extendService.generateSet(field)).append("\n");
                    }
                    writer.newLine();
                    writer.write(getAndSet.toString());
                    writer.newLine();
                    writer.write("}");
                    break;
                }
            } catch (IOException | SQLException e) {
                e.printStackTrace();
            }
        }
        writer.close();
        fileReader.close();
    }

}
