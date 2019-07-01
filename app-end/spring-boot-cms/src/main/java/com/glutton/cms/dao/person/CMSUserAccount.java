package com.glutton.cms.dao.person;

import java.util.Date;

/**
 * @Author: lijun_isf
 */
public class CMSUserAccount {
    private long accountId;
    private String accountName;
    private String accountPassword;
    private Date loginDate;
    private String loginIp;
    private String loginType;
    private String loginWebHeader;
    private long userId;

    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return this.accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPassword() {
        return this.accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public String getLoginIp() {
        return this.loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public String getLoginType() {
        return this.loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public String getLoginWebHeader() {
        return this.loginWebHeader;
    }

    public void setLoginWebHeader(String loginWebHeader) {
        this.loginWebHeader = loginWebHeader;
    }

    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

}