package com.annie.entity;

import java.util.Date;

public class Comment {
    private Integer ccId;

    private Integer ccCId;

    private Date ccTime;

    private String ccContent;

    private Integer ccBulou;

    private Integer ccUId;

    public Integer getCcId() {
        return ccId;
    }

    public void setCcId(Integer ccId) {
        this.ccId = ccId;
    }

    public Integer getCcCId() {
        return ccCId;
    }

    public void setCcCId(Integer ccCId) {
        this.ccCId = ccCId;
    }

    public Date getCcTime() {
        return ccTime;
    }

    public void setCcTime(Date ccTime) {
        this.ccTime = ccTime;
    }

    public String getCcContent() {
        return ccContent;
    }

    public void setCcContent(String ccContent) {
        this.ccContent = ccContent == null ? null : ccContent.trim();
    }

    public Integer getCcBulou() {
        return ccBulou;
    }

    public void setCcBulou(Integer ccBulou) {
        this.ccBulou = ccBulou;
    }

    public Integer getCcUId() {
        return ccUId;
    }

    public void setCcUId(Integer ccUId) {
        this.ccUId = ccUId;
    }
}