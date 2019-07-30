package com.glutton.cms.dao.person;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_user_account")
public class CmsUserAccount {
    @Id
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "account_password")
    private String accountPassword;

    @Column(name = "login_date")
    private Date loginDate;

    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登陆的系统PC,PHONE,PAD
     */
    @Column(name = "login_type")
    private String loginType;

    @Column(name = "login_web_header")
    private String loginWebHeader;

    @Column(name = "user_id")
    private Long userId;

    /**
     * @return account_id
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * @param accountId
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * @return account_name
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * @return account_password
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * @param accountPassword
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    /**
     * @return login_date
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * @param loginDate
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * @return login_ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * @param loginIp
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 获取登陆的系统PC,PHONE,PAD
     *
     * @return login_type - 登陆的系统PC,PHONE,PAD
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * 设置登陆的系统PC,PHONE,PAD
     *
     * @param loginType 登陆的系统PC,PHONE,PAD
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    /**
     * @return login_web_header
     */
    public String getLoginWebHeader() {
        return loginWebHeader;
    }

    /**
     * @param loginWebHeader
     */
    public void setLoginWebHeader(String loginWebHeader) {
        this.loginWebHeader = loginWebHeader == null ? null : loginWebHeader.trim();
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}