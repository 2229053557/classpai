package com.example.demo.service;

import com.example.demo.entity.UserCourseHomework;
import com.example.demo.entity.superUserHomework;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserCourseHomeworkService {
    Integer findSubmitNums(Integer hId,Integer cId,String isAlreadySubmit);
    Integer findCorrectingNums(Integer hId,Integer cId,String isAlreadyCorrecting);
    void submitHomework(UserCourseHomework userCourseHomework);
    UserCourseHomework findOneUserCourseHomework(Integer hId,Integer cId,String classPaiNum);
    void reSubmitHomework(UserCourseHomework userCourseHomework);
    List<superUserHomework> findAllUserHomework(Integer hId,Integer cId,String role);
    void subAchievement(UserCourseHomework userCourseHomework);
}
