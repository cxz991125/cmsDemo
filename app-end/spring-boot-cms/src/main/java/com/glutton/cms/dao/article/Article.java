package com.glutton.cms.dao.article;

import java.util.Date;
import javax.persistence.*;

@Table(name = "cms_article")
public class Article {
    @Id
    private Long id;

    @Column(name = "category_id")
    private Long categoryId;

    private String title;

    private String summary;

    private String author;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    @Column(name = "content_id")
    private Long contentId;

    /**
     * 状态draft,audit,publish
     */
    private String status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return category_id
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * @param summary
     */
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return content_id
     */
    public Long getContentId() {
        return contentId;
    }

    /**
     * @param contentId
     */
    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    /**
     * 获取状态draft,audit,publish
     *
     * @return status - 状态draft,audit,publish
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态draft,audit,publish
     *
     * @param status 状态draft,audit,publish
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}