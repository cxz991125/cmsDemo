package com.glutton.cms.dao.person;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_user")
public class CmsUser {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_age")
    private Integer userAge;

    @Column(name = "user_nickname")
    private String userNickname;

    @Column(name = "user_phone")
    private String userPhone;

    @Column(name = "join_date")
    private Date joinDate;

    @Column(name = "user_email")
    private String userEmail;

    /**
     * 获取主键
     *
     * @return user_id - 主键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return user_age
     */
    public Integer getUserAge() {
        return userAge;
    }

    /**
     * @param userAge
     */
    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    /**
     * @return user_nickname
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * @param userNickname
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    /**
     * @return user_phone
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * @param userPhone
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * @return join_date
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return user_email
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }
}