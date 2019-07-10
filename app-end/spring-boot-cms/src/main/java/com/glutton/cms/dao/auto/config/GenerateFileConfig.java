package com.glutton.cms.dao.auto.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: lijun_isf
 */
@ConfigurationProperties(prefix = "generate-file")
public class GenerateFileConfig {

    private String packageName = "mapping";
    private boolean isAbsolute = false;

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isAbsolute() {
        return isAbsolute;
    }

    public void setAbsolute(boolean absolute) {
        isAbsolute = absolute;
    }
}
