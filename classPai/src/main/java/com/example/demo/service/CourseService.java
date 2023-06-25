package com.example.demo.service;

import com.example.demo.entity.Course;
import com.example.demo.entity.superCourse;

public interface CourseService {
    Course findCourseByAddCourseCode(String addCourseCode);
    Integer insertCourse(Course course);
    superCourse findCourseByCId(Integer cId);
    void deleteCourse(String cId);
    void editCourse(Course course);
}
