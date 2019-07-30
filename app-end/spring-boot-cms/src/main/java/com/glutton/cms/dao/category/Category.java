package com.glutton.cms.dao.category;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "cms_category")
public class Category {
    /**
     * 栏目ID
     */
    @Id
    @Column(name = "c_id")
    private Long cId;

    /**
     * 栏目父ID
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 栏目名称
     */
    @Column(name = "c_name")
    private String cName;

    @Column(name = "c_create_time")
    private Date cCreateTime;

    /**
     * 排序
     */
    @Column(name = "c_order")
    private Long cOrder;

    /**
     * 栏目别名
     */
    @Column(name = "c_aliase")
    private String cAliase;

    /**
     * 获取栏目ID
     *
     * @return c_id - 栏目ID
     */
    public Long getcId() {
        return cId;
    }

    /**
     * 设置栏目ID
     *
     * @param cId 栏目ID
     */
    public void setcId(Long cId) {
        this.cId = cId;
    }

    /**
     * 获取栏目父ID
     *
     * @return parent_id - 栏目父ID
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置栏目父ID
     *
     * @param parentId 栏目父ID
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取栏目名称
     *
     * @return c_name - 栏目名称
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置栏目名称
     *
     * @param cName 栏目名称
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * @return c_create_time
     */
    public Date getcCreateTime() {
        return cCreateTime;
    }

    /**
     * @param cCreateTime
     */
    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    /**
     * 获取排序
     *
     * @return c_order - 排序
     */
    public Long getcOrder() {
        return cOrder;
    }

    /**
     * 设置排序
     *
     * @param cOrder 排序
     */
    public void setcOrder(Long cOrder) {
        this.cOrder = cOrder;
    }

    /**
     * 获取栏目别名
     *
     * @return c_aliase - 栏目别名
     */
    public String getcAliase() {
        return cAliase;
    }

    /**
     * 设置栏目别名
     *
     * @param cAliase 栏目别名
     */
    public void setcAliase(String cAliase) {
        this.cAliase = cAliase == null ? null : cAliase.trim();
    }
}