package com.example.demo.entity;

public class Course {
    private Integer cId;
    private String cName;
    private String className;
    private String schoolYear;
    private String semester;
    private String addCourseCode;
    private String backgroundImage;

    public Course() {
    }


    public Course(Integer cId, String cName, String className, String schoolYear, String semester, String addCourseCode, String backgroundImage) {
        this.cId = cId;
        this.cName = cName;
        this.className = className;
        this.schoolYear = schoolYear;
        this.semester = semester;
        this.addCourseCode = addCourseCode;
        this.backgroundImage = backgroundImage;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getAddCourseCode() {
        return addCourseCode;
    }

    public void setAddCourseCode(String addCourseCode) {
        this.addCourseCode = addCourseCode;
    }

    public String getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }
}
