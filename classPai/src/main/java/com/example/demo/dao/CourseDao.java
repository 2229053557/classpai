package com.example.demo.dao;

import com.example.demo.entity.Course;
import com.example.demo.entity.superCourse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Mapper
@Component(value="CourseDao")
public interface CourseDao {
     Course findCourseByAddCourseCode(String addCourseCode);
     Integer insertCourse(Course course);
     superCourse findCourseByCId(Integer cId);
     void deleteCourse(String cId);
     void editCourse(Course course);
}
