package com.example.demo.service.impl;

import com.example.demo.dao.UserCourseHomeworkDao;
import com.example.demo.entity.UserCourseHomework;
import com.example.demo.entity.superUserHomework;
import com.example.demo.service.UserCourseHomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserCourseHomeworkServiceBean implements UserCourseHomeworkService {
    @Autowired
    UserCourseHomeworkDao userCourseHomeworkDao;

    public Integer findSubmitNums(Integer hId,Integer cId,String isAlreadySubmit){
        return userCourseHomeworkDao.findSubmitNums(hId,cId,isAlreadySubmit);
    }
    public Integer findCorrectingNums(Integer hId,Integer cId,String isAlreadyCorrecting){
        return userCourseHomeworkDao.findCorrectingNums(hId,cId,isAlreadyCorrecting);
    }

    public void submitHomework(UserCourseHomework userCourseHomework){
        this.userCourseHomeworkDao.submitHomework(userCourseHomework);

    }
    public UserCourseHomework findOneUserCourseHomework(Integer hId,Integer cId,String classPaiNum){
        return  userCourseHomeworkDao.findOneUserCourseHomework(hId,cId,classPaiNum);
    }
    public void reSubmitHomework(UserCourseHomework userCourseHomework){
        this.userCourseHomeworkDao.reSubmitHomework(userCourseHomework);
    }

    public List<superUserHomework> findAllUserHomework(Integer hId,Integer cId,String role){
        return  this.userCourseHomeworkDao.findAllUserHomework(hId,cId,role);
    }
    public void subAchievement(UserCourseHomework userCourseHomework){
        this.userCourseHomeworkDao.subAchievement(userCourseHomework);
    }
}
