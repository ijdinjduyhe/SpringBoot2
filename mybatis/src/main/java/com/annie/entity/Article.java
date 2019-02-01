package com.annie.entity;

import java.util.Date;

public class Article {
    private Integer aaId;

    private Integer aaAId;

    private Date aaCreatetime;

    private String aaArticlehead;

    private String aaArticleheads;

    private Integer aaClick;

    private Integer aaBulou;

    private Integer aaComment;

    private Integer aaReward;

    private Integer aaUId;

    private Integer aStatus;

    private String aaArticlecontent;

    public Integer getAaId() {
        return aaId;
    }

    public void setAaId(Integer aaId) {
        this.aaId = aaId;
    }

    public Integer getAaAId() {
        return aaAId;
    }

    public void setAaAId(Integer aaAId) {
        this.aaAId = aaAId;
    }

    public Date getAaCreatetime() {
        return aaCreatetime;
    }

    public void setAaCreatetime(Date aaCreatetime) {
        this.aaCreatetime = aaCreatetime;
    }

    public String getAaArticlehead() {
        return aaArticlehead;
    }

    public void setAaArticlehead(String aaArticlehead) {
        this.aaArticlehead = aaArticlehead == null ? null : aaArticlehead.trim();
    }

    public String getAaArticleheads() {
        return aaArticleheads;
    }

    public void setAaArticleheads(String aaArticleheads) {
        this.aaArticleheads = aaArticleheads == null ? null : aaArticleheads.trim();
    }

    public Integer getAaClick() {
        return aaClick;
    }

    public void setAaClick(Integer aaClick) {
        this.aaClick = aaClick;
    }

    public Integer getAaBulou() {
        return aaBulou;
    }

    public void setAaBulou(Integer aaBulou) {
        this.aaBulou = aaBulou;
    }

    public Integer getAaComment() {
        return aaComment;
    }

    public void setAaComment(Integer aaComment) {
        this.aaComment = aaComment;
    }

    public Integer getAaReward() {
        return aaReward;
    }

    public void setAaReward(Integer aaReward) {
        this.aaReward = aaReward;
    }

    public Integer getAaUId() {
        return aaUId;
    }

    public void setAaUId(Integer aaUId) {
        this.aaUId = aaUId;
    }

    public Integer getaStatus() {
        return aStatus;
    }

    public void setaStatus(Integer aStatus) {
        this.aStatus = aStatus;
    }

    public String getAaArticlecontent() {
        return aaArticlecontent;
    }

    public void setAaArticlecontent(String aaArticlecontent) {
        this.aaArticlecontent = aaArticlecontent == null ? null : aaArticlecontent.trim();
    }
}