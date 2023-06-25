package com.example.demo.service;

import com.example.demo.entity.UserCourse;

import java.util.List;

public interface UserCourseService {
    List<UserCourse> findUserCourse(String classPaiNum);
    void changeCourseTopping(String classPaiNum, Integer cId,String isTopping);
    void exitCourse(String classPaiNum, Integer cId);
    void pigeonholeCourse(String classPaiNum, Integer cId, String isPlaceOnFile);
    void addCourse(String classPaiNum,Integer cId,String role);
    UserCourse findUserCourseByCId(Integer cId,String role);
    Integer findUserNums(Integer cId,String role);
    void pigeonholeCourseAll(Integer cId, String isPlaceOnFile);
    void sortCourse(String classPaiNum, Integer cId, Integer serialNumber);
    UserCourse findOneUserCourse(String classPaiNum, Integer cId);
}
