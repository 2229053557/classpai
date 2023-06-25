package com.example.demo.entity;

public class superUserHomework extends UserCourseHomework {
    private String stuNumber;
    private String name;

    public superUserHomework() {
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
