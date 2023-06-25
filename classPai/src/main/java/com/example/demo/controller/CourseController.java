package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.User;
import com.example.demo.entity.UserCourse;
import com.example.demo.entity.superCourse;
import com.example.demo.service.CourseService;
import com.example.demo.service.UserCourseService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    UserCourseService userCourseService;

    @Autowired
    UserService userService;

    @PostMapping("/findAllCourse")
    public List<superCourse> getAllCourse(@RequestParam String classPaiNum){
         List<superCourse> theUserCourse = new LinkedList<>();
         List<UserCourse> userCourses = userCourseService.findUserCourse(classPaiNum);
         for(int i=0;i<userCourses.size();i++){
             superCourse superCourse = courseService.findCourseByCId(userCourses.get(i).getcId());
             superCourse.setRole(userCourses.get(i).getRole());
             if(userCourses.get(i).getRole().equals("学生")){
                    User user=userService.findUserByClassPaiNum(userCourseService.findUserCourseByCId(userCourses.get(i).getcId(),"老师").getClassPaiNum());
                    superCourse.setTeacherName(user.getName());
                    superCourse.setTeacherHeadPortrait(user.getHeadPortrait());
             }
             else {
                   superCourse.setTotal(userCourseService.findUserNums(userCourses.get(i).getcId(),"学生"));
             }
             superCourse.setIsTopping(userCourses.get(i).getIsTopping());
             superCourse.setIsPlaceOnFile(userCourses.get(i).getIsPlaceOnFile());
             superCourse.setSerialNumber(userCourses.get(i).getSerialNumber());
             theUserCourse.add(superCourse);
         }
         return theUserCourse;
    }

    @PostMapping("/findOneCourse")
    public superCourse findOneCourse(@RequestParam String classPaiNum,Integer cId){
        System.out.println(classPaiNum+"   "+cId);
        superCourse superCourse = courseService.findCourseByCId(cId);
        UserCourse userCourse = userCourseService.findOneUserCourse(classPaiNum,cId);
        superCourse.setRole(userCourse.getRole());
        superCourse.setTotal(userCourseService.findUserNums(cId,"学生"));
        return superCourse;
    }

    @PostMapping("/createCourse")
    public Integer createCourse(@RequestBody superCourse superCourse){
        Integer cId= courseService.insertCourse(superCourse);
        this.userCourseService.addCourse(superCourse.getTeacherClassPaiNum(),cId,"老师");
        return cId;
    }
    @PostMapping("/editCourse")
    public void editCourse(@RequestBody Course course){
        this.courseService.editCourse(course);
    }

    @PostMapping("/deleteCourse")
    public void deleteCourse(@RequestParam String cId){
        this.courseService.deleteCourse(cId);
    }
}
