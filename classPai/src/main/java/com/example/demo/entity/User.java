package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class User implements UserDetails {
    private String mailboxOrTel;
    private String password;
    private String name;
    private String classPaiNum;
    private String role;
    private String school;
    private String department;
    private String major;
    private String coursesTaught;
    private String headPortrait;
    private String stuNumber;


    public User() {
    }

    public User(String mailboxOrTel, String password, String name, String classPaiNum, String role, String school, String department, String major, String coursesTaught, String headPortrait, String stuNumber) {
        this.mailboxOrTel = mailboxOrTel;
        this.password = password;
        this.name = name;
        this.classPaiNum = classPaiNum;
        this.role = role;
        this.school = school;
        this.department = department;
        this.major = major;
        this.coursesTaught = coursesTaught;
        this.headPortrait = headPortrait;
        this.stuNumber = stuNumber;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getMailboxOrTel() {
        return mailboxOrTel;
    }

    public void setMailboxOrTel(String mailboxOrTel) {
        this.mailboxOrTel = mailboxOrTel;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return this.mailboxOrTel;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassPaiNum() {
        return classPaiNum;
    }

    public void setClassPaiNum(String classPaiNum) {
        this.classPaiNum = classPaiNum;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }
}
