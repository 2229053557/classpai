package com.example.demo.entity;

public class UserCourse {
    private String classPaiNum;
    private Integer cId;
    private String role;
    private String isTopping;
    private Integer serialNumber;
    private String isPlaceOnFile;

    public UserCourse() {
    }

    public UserCourse(String classPaiNum, Integer cId, String role) {
        this.classPaiNum = classPaiNum;
        this.cId = cId;
        this.role = role;
    }

    public String getClassPaiNum() {
        return classPaiNum;
    }

    public void setClassPaiNum(String classPaiNum) {
        this.classPaiNum = classPaiNum;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIsTopping() {
        return isTopping;
    }

    public void setIsTopping(String isTopping) {
        this.isTopping = isTopping;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getIsPlaceOnFile() {
        return isPlaceOnFile;
    }

    public void setIsPlaceOnFile(String isPlaceOnFile) {
        this.isPlaceOnFile = isPlaceOnFile;
    }
}
