package com.glutton.cms.dao.person;

import java.util.Date;

public class CmsUserAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.account_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private Long accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.account_name
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private String accountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.account_password
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private String accountPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.login_date
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private Date loginDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.login_ip
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private String loginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.login_type
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private String loginType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.login_web_header
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private String loginWebHeader;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_user_account.user_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.account_id
     *
     * @return the value of cms_user_account.account_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.account_id
     *
     * @param accountId the value for cms_user_account.account_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.account_name
     *
     * @return the value of cms_user_account.account_name
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.account_name
     *
     * @param accountName the value for cms_user_account.account_name
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.account_password
     *
     * @return the value of cms_user_account.account_password
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.account_password
     *
     * @param accountPassword the value for cms_user_account.account_password
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword == null ? null : accountPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.login_date
     *
     * @return the value of cms_user_account.login_date
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.login_date
     *
     * @param loginDate the value for cms_user_account.login_date
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.login_ip
     *
     * @return the value of cms_user_account.login_ip
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.login_ip
     *
     * @param loginIp the value for cms_user_account.login_ip
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.login_type
     *
     * @return the value of cms_user_account.login_type
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public String getLoginType() {
        return loginType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.login_type
     *
     * @param loginType the value for cms_user_account.login_type
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? null : loginType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.login_web_header
     *
     * @return the value of cms_user_account.login_web_header
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public String getLoginWebHeader() {
        return loginWebHeader;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.login_web_header
     *
     * @param loginWebHeader the value for cms_user_account.login_web_header
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setLoginWebHeader(String loginWebHeader) {
        this.loginWebHeader = loginWebHeader == null ? null : loginWebHeader.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_user_account.user_id
     *
     * @return the value of cms_user_account.user_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_user_account.user_id
     *
     * @param userId the value for cms_user_account.user_id
     *
     * @mbg.generated Fri Jul 26 14:37:13 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}