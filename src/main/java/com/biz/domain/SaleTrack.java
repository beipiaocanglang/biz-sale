package com.biz.domain;

import com.biz.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

public class SaleTrack implements Serializable {

    private String id;
    private String cusId;
    private Date createdOn;
    private Date happendOn;
    private Integer type;
    private String comment;
    private String updateUser;
    private int deleted;
    private String flowParent;
    private String userName;
    private String cusName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getHappendOn() {
        return happendOn;
    }

    public void setHappendOn(Date happendOn) {
        this.happendOn = happendOn;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public int getDeleted() {
        return deleted;
    }

    public void setDeleted(int deleted) {
        this.deleted = deleted;
    }

    public String getFlowParent() {
        return flowParent;
    }

    public void setFlowParent(String flowParent) {
        this.flowParent = flowParent;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }
}
