package com.example.demo.entity;

public class UserCourseHomework {
    private Integer hId;
    private Integer cId;
    private String classPaiNum;
    private String[] submitContent;
    private String leavingMessage;
    private String isAlreadySubmit;
    private String isAlreadyCorrecting;
    private String achievement;
    private String isHideAchievement;
    private String teacherComments;
    private Integer reviewTimes;
    private Integer repulseTime;
    private Integer expeditingTimes;

    public UserCourseHomework() {
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getClassPaiNum() {
        return classPaiNum;
    }

    public void setClassPaiNum(String classPaiNum) {
        this.classPaiNum = classPaiNum;
    }

    public String[] getSubmitContent() {
        return submitContent;
    }

    public void setSubmitContent(String[] submitContent) {
        this.submitContent = submitContent;
    }

    public String getLeavingMessage() {
        return leavingMessage;
    }

    public void setLeavingMessage(String leavingMessage) {
        this.leavingMessage = leavingMessage;
    }

    public String getIsAlreadySubmit() {
        return isAlreadySubmit;
    }

    public void setIsAlreadySubmit(String isAlreadySubmit) {
        this.isAlreadySubmit = isAlreadySubmit;
    }

    public String getIsAlreadyCorrecting() {
        return isAlreadyCorrecting;
    }

    public void setIsAlreadyCorrecting(String isAlreadyCorrecting) {
        this.isAlreadyCorrecting = isAlreadyCorrecting;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public String getIsHideAchievement() {
        return isHideAchievement;
    }

    public void setIsHideAchievement(String isHideAchievement) {
        this.isHideAchievement = isHideAchievement;
    }

    public String getTeacherComments() {
        return teacherComments;
    }

    public void setTeacherComments(String teacherComments) {
        this.teacherComments = teacherComments;
    }

    public Integer getReviewTimes() {
        return reviewTimes;
    }

    public void setReviewTimes(Integer reviewTimes) {
        this.reviewTimes = reviewTimes;
    }

    public Integer getRepulseTime() {
        return repulseTime;
    }

    public void setRepulseTime(Integer repulseTime) {
        this.repulseTime = repulseTime;
    }

    public Integer getExpeditingTimes() {
        return expeditingTimes;
    }

    public void setExpeditingTimes(Integer expeditingTimes) {
        this.expeditingTimes = expeditingTimes;
    }
}
