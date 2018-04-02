package com.biz.domain;

import com.biz.util.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.Date;

public class SaleMainData implements Serializable{
    /**
     * 主键id：uuid
     */
    private String id;

    /**
     * 客户姓名
     */
    private String cusName;

    /**
     * 开始时间
     */
    private Date beginDate;

    /**
     * 更新时间
     */
    private Date updateDate;

    /**
     * 是否见到决策人? 1：见到、0：没有
     */
    private String seenPolicymaker;

    /**
     * 决策人职位
     */
    private String policymakerPosition;

    /**
     * 是否搞定决策人？1：是、0：否
     */
    private String donePolicymaker;

    /**
     * 搞定的决策人是什么职位
     */
    private String donePolicymakerPosition;

    /**
     * 是否确有其事？1：是、0：否
     */
    private String isReal;

    /**
     * 确有其事的备注
     */
    private String isRealComment;

    /**
     * 是否有5人以上使用产品？1：是、0：否
     */
    private String fiveUserUp;

    /**
     * 5人以上使用产品备注
     */
    private String fiveUserUpComment;

    /**
     * 客户联系姓名
     */
    private String contactName;

    /**
     * 客户联系电话
     */
    private String contactPhone;

    /**
     * 客户联系邮箱
     */
    private String contactEmail;

    /**
     * 客户雇员人数
     */
    private Integer cusEmpNum;

    /**
     * 客户所在城市
     */
    private String cusCity;

    /**
     * 产品预计上线时间
     */
    private Date launchTime;

    /**
     * 销售关单预计时间
     */
    private Date closeTime;

    /**
     * 下一个决策人
     */
    private String nextPolicymakerAction;

    private String nextReqAction;

    /**
     * 销售关单预计时间
     */
    private Date trueCloseTime;

    /**
     * 状态
     */
    private String status;

    /**
     * 上传者
     */
    private String uploads;

    /**
     * 分配给谁
     */
    private String assign;

    /**
     * 用户重点需求
     */
    private String importantReq;

    /**
     * 日志信息
     */
    private String logInfo;

    /**
     * 优先级  取值：1、2、3、4、。。。(从1开始)
     * @return
     */
    private int priorityLevel;

    private int track;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getSeenPolicymaker() {
        return seenPolicymaker;
    }

    public void setSeenPolicymaker(String seenPolicymaker) {
        this.seenPolicymaker = seenPolicymaker == null ? null : seenPolicymaker.trim();
    }

    public String getPolicymakerPosition() {
        return policymakerPosition;
    }

    public void setPolicymakerPosition(String policymakerPosition) {
        this.policymakerPosition = policymakerPosition == null ? null : policymakerPosition.trim();
    }

    public String getDonePolicymaker() {
        return donePolicymaker;
    }

    public void setDonePolicymaker(String donePolicymaker) {
        this.donePolicymaker = donePolicymaker == null ? null : donePolicymaker.trim();
    }

    public String getDonePolicymakerPosition() {
        return donePolicymakerPosition;
    }

    public void setDonePolicymakerPosition(String donePolicymakerPosition) {
        this.donePolicymakerPosition = donePolicymakerPosition == null ? null : donePolicymakerPosition.trim();
    }

    public String getIsReal() {
        return isReal;
    }

    public void setIsReal(String isReal) {
        this.isReal = isReal == null ? null : isReal.trim();
    }

    public String getIsRealComment() {
        return isRealComment;
    }

    public void setIsRealComment(String isRealComment) {
        this.isRealComment = isRealComment == null ? null : isRealComment.trim();
    }

    public String getFiveUserUp() {
        return fiveUserUp;
    }

    public void setFiveUserUp(String fiveUserUp) {
        this.fiveUserUp = fiveUserUp == null ? null : fiveUserUp.trim();
    }

    public String getFiveUserUpComment() {
        return fiveUserUpComment;
    }

    public void setFiveUserUpComment(String fiveUserUpComment) {
        this.fiveUserUpComment = fiveUserUpComment == null ? null : fiveUserUpComment.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail == null ? null : contactEmail.trim();
    }

    public Integer getCusEmpNum() {
        return cusEmpNum;
    }

    public void setCusEmpNum(Integer cusEmpNum) {
        this.cusEmpNum = cusEmpNum;
    }

    public String getCusCity() {
        return cusCity;
    }

    public void setCusCity(String cusCity) {
        this.cusCity = cusCity == null ? null : cusCity.trim();
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(Date launchTime) {
        this.launchTime = launchTime;
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getNextPolicymakerAction() {
        return nextPolicymakerAction;
    }

    public void setNextPolicymakerAction(String nextPolicymakerAction) {
        this.nextPolicymakerAction = nextPolicymakerAction == null ? null : nextPolicymakerAction.trim();
    }

    public String getNextReqAction() {
        return nextReqAction;
    }

    public void setNextReqAction(String nextReqAction) {
        this.nextReqAction = nextReqAction == null ? null : nextReqAction.trim();
    }

    @JsonSerialize(using=JsonDateSerializer.class)
    public Date getTrueCloseTime() {
        return trueCloseTime;
    }

    public void setTrueCloseTime(Date trueCloseTime) {
        this.trueCloseTime = trueCloseTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUploads() {
        return uploads;
    }

    public void setUploads(String uploads) {
        this.uploads = uploads == null ? null : uploads.trim();
    }

    public String getAssign() {
        return assign;
    }

    public void setAssign(String assign) {
        this.assign = assign == null ? null : assign.trim();
    }

    public String getImportantReq() {
        return importantReq;
    }

    public void setImportantReq(String importantReq) {
        this.importantReq = importantReq == null ? null : importantReq.trim();
    }

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo == null ? null : logInfo.trim();
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public int getTrack() {
        return track;
    }

    public void setTrack(int track) {
        this.track = track;
    }
}
