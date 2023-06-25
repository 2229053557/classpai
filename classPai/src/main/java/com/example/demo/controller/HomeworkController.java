package com.example.demo.controller;

import com.example.demo.dao.UserCourseHomeworkDao;
import com.example.demo.entity.UserCourseHomework;
import com.example.demo.entity.homework;
import com.example.demo.entity.superHomework;
import com.example.demo.service.HomeworkService;
import com.example.demo.service.UserCourseHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/homework")
public class HomeworkController {
    @Autowired
    HomeworkService homeworkService;

    @Autowired
    UserCourseHomeworkService userCourseHomeworkService;

    @PostMapping("/createHomework")
    public void createHomework(@RequestBody homework homework){
        this.homeworkService.insertHomework(homework);
    }

    @PostMapping("/findCourseHomework")
    public List<superHomework> findCourseHomework(@RequestParam Integer cId){
        List<superHomework> superHomeworks= this.homeworkService.findCourseHomework(cId);
        for(int i=0;i<superHomeworks.size();i++){
            superHomeworks.get(i).setSubmitNums(userCourseHomeworkService.findSubmitNums(superHomeworks.get(i).gethId(),cId,"1"));
            superHomeworks.get(i).setAlreadyCorrectingNums(userCourseHomeworkService.findCorrectingNums(superHomeworks.get(i).gethId(),cId,"1"));
        }
        return superHomeworks;
    }

    @PostMapping("/findOneCourseHomework")
    public superHomework findOneCourseHomework(@RequestParam Integer cId,Integer hId,String classPaiNum){
        superHomework superHomework= this.homeworkService.findOneCourseHomework(cId,hId,classPaiNum);
        UserCourseHomework userCourseHomework = this.userCourseHomeworkService.findOneUserCourseHomework(hId,cId,classPaiNum);
        if(userCourseHomework!=null) {
            superHomework.setIsAlreadySubmit(userCourseHomework.getIsAlreadySubmit());
            superHomework.setSubmitContent(userCourseHomework.getSubmitContent());
            superHomework.setIsAlreadyCorrecting(userCourseHomework.getIsAlreadyCorrecting());
            superHomework.setAchievement(userCourseHomework.getAchievement());
        }
        return superHomework;
    }
}
