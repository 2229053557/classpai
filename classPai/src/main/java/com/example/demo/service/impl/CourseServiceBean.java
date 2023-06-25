package com.example.demo.service.impl;

import com.example.demo.dao.CourseDao;
import com.example.demo.entity.Course;
import com.example.demo.entity.superCourse;
import com.example.demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CourseServiceBean implements CourseService {
    @Autowired
    CourseDao courseDao;

    public Course findCourseByAddCourseCode(String addCourseCode){
        return courseDao.findCourseByAddCourseCode(addCourseCode);
    }

    public Integer insertCourse(Course course){
        course.setAddCourseCode(UUID.randomUUID().toString().substring(0,7));
        course.setBackgroundImage("http://localhost:8081/bgImg/01.png");
        courseDao.insertCourse(course);
        return course.getcId();
    }

    public superCourse findCourseByCId(Integer cId){
        return courseDao.findCourseByCId(cId);
    }
    public void deleteCourse(String cId){
        courseDao.deleteCourse(cId);
    }
    public void editCourse(Course course){
        courseDao.editCourse(course);
    }
}
