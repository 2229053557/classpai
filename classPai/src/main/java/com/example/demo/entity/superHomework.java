package com.example.demo.entity;

public class superHomework extends homework {
    private Integer submitNums;
    private Integer alreadyCorrectingNums;
    private Integer noCorrectingNums;
    private String isAlreadyCorrecting;
    private String achievement;
    private String[] submitContent;
    private String isAlreadySubmit;

    public superHomework() {
        this.submitNums=0;
        this.alreadyCorrectingNums=0;
        this.noCorrectingNums = 0;
    }

    public Integer getSubmitNums() {
        return submitNums;
    }

    public void setSubmitNums(Integer submitNums) {
        this.submitNums = submitNums;
    }

    public Integer getAlreadyCorrectingNums() {
        return alreadyCorrectingNums;
    }

    public void setAlreadyCorrectingNums(Integer alreadyCorrectingNums) {
        this.alreadyCorrectingNums = alreadyCorrectingNums;
    }

    public Integer getNoCorrectingNums() {
        return noCorrectingNums;
    }

    public void setNoCorrectingNums(Integer noCorrectingNums) {
        this.noCorrectingNums = noCorrectingNums;
    }

    public String[] getSubmitContent() {
        return submitContent;
    }

    public void setSubmitContent(String[] submitContent) {
        this.submitContent = submitContent;
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
}
