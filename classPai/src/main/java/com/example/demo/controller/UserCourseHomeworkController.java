package com.example.demo.controller;

import com.example.demo.entity.UserCourseHomework;
import com.example.demo.entity.superUserHomework;
import com.example.demo.service.UserCourseHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userCourseHomework")
public class UserCourseHomeworkController {
    @Autowired
    UserCourseHomeworkService userCourseHomeworkService;

    @PostMapping("/submitHomework")
    public void submitHomework(@RequestBody UserCourseHomework userCourseHomework){
           this.userCourseHomeworkService.submitHomework(userCourseHomework);
    }

    @PostMapping("/reSubmitHomework")
    public void reSubmitHomework(@RequestBody UserCourseHomework userCourseHomework){
        this.userCourseHomeworkService.reSubmitHomework(userCourseHomework);
    }

    @PostMapping("/findAllUserHomework")
    public List<superUserHomework> findAllUserHomework(@RequestParam Integer hId, Integer cId){
        return this.userCourseHomeworkService.findAllUserHomework(hId,cId,"学生");
    }

    @PostMapping("/subAchievement")
    public void subAchievement(@RequestBody UserCourseHomework userCourseHomework){
        this.userCourseHomeworkService.subAchievement(userCourseHomework);
    }
}
