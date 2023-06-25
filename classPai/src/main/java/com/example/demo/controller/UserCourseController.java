package com.example.demo.controller;

import com.example.demo.service.CourseService;
import com.example.demo.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/UserCourse")
public class UserCourseController {
    @Autowired
    UserCourseService userCourseService;

    @Autowired
    CourseService courseService;


    @PostMapping("/changeUserCourseTopping")
    public void changeCourseTopping(@RequestParam String classPaiNum, Integer cId,String isTopping){
          this.userCourseService.changeCourseTopping(classPaiNum,cId,isTopping);
    }

    @PostMapping("/exitCourse")
    public void exitCourse(@RequestParam String classPaiNum, Integer cId){
        this.userCourseService.exitCourse(classPaiNum,cId);
    }
    @PostMapping("/pigeonholeCourse")
    public void pigeonholeCourse(@RequestParam String classPaiNum, Integer cId,String isPlaceOnFile){
        this.userCourseService.pigeonholeCourse(classPaiNum,cId,isPlaceOnFile);
    }

    @PostMapping("/pigeonholeCourseAll")
    public void pigeonholeCourseAll(@RequestParam Integer cId,String isPlaceOnFile){
        this.userCourseService.pigeonholeCourseAll(cId,isPlaceOnFile);
    }

    @PostMapping("/addCourse")
    public void addCourse(@RequestParam String classPaiNum, String addCourseCode){
        this.userCourseService.addCourse(classPaiNum,this.courseService.findCourseByAddCourseCode(addCourseCode).getcId(),"学生");
    }

    @PostMapping("/sortCourse")
    public void sortCourse(@RequestParam String classPaiNum, Integer cId,Integer serialNumber){
        this.userCourseService.sortCourse(classPaiNum,cId,serialNumber);
    }
}
