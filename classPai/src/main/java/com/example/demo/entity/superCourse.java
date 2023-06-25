package com.example.demo.entity;

public class superCourse extends Course {
    private String role;
    private Integer total;
    private String teacherClassPaiNum;
    private String teacherName;
    private String isTopping;
    private Integer serialNumber;
    private String isPlaceOnFile;
    private String teacherHeadPortrait;
    public superCourse() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getTeacherClassPaiNum() {
        return teacherClassPaiNum;
    }

    public void setTeacherClassPaiNum(String teacherClassPaiNum) {
        this.teacherClassPaiNum = teacherClassPaiNum;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherHeadPortrait() {
        return teacherHeadPortrait;
    }

    public void setTeacherHeadPortrait(String teacherHeadPortrait) {
        this.teacherHeadPortrait = teacherHeadPortrait;
    }
}
