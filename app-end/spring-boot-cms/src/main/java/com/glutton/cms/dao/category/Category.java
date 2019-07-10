package com.glutton.cms.dao.category;

import java.util.Date;

/**
 * @Author: lijun_isf
 */
public class Category {
    private long cId;
    private String cName;
    private Date cCreateTime;
    private long cOrder;
    private String cAliase;
    private int parentId;

    public long getcId() {
        return cId;
    }

    public void setcId(long cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Date getcCreateTime() {
        return cCreateTime;
    }

    public void setcCreateTime(Date cCreateTime) {
        this.cCreateTime = cCreateTime;
    }

    public long getcOrder() {
        return cOrder;
    }

    public void setcOrder(long cOrder) {
        this.cOrder = cOrder;
    }

    public String getcAliase() {
        return cAliase;
    }

    public void setcAliase(String cAliase) {
        this.cAliase = cAliase;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }
}