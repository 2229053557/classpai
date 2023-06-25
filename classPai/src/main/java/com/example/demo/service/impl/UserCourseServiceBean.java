package com.example.demo.service.impl;

import com.example.demo.dao.UserCourseDao;
import com.example.demo.entity.UserCourse;
import com.example.demo.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCourseServiceBean implements UserCourseService {
    @Autowired
    UserCourseDao userCourseDao;

    public List<UserCourse> findUserCourse(String classPaiNum){
        return userCourseDao.findUserCourse(classPaiNum);
    }
    public void changeCourseTopping(String classPaiNum, Integer cId,String isTopping){
           userCourseDao.changeCourseTopping(classPaiNum,cId,isTopping);
    }
    public void exitCourse(String classPaiNum, Integer cId){
        userCourseDao.exitCourse(classPaiNum,cId);
    }
    public void pigeonholeCourse(String classPaiNum, Integer cId, String isPlaceOnFile){
        userCourseDao.pigeonholeCourse(classPaiNum,cId,isPlaceOnFile);
    }
    public void pigeonholeCourseAll(Integer cId, String isPlaceOnFile){
        userCourseDao.pigeonholeCourseAll(cId,isPlaceOnFile);
    }
    public void addCourse(String classPaiNum,Integer cId,String role){

        userCourseDao.addCourse(classPaiNum,cId,role);
    }
    public UserCourse findUserCourseByCId(Integer cId,String role){
        return userCourseDao.findUserCourseByCId(cId,role);
    }

    public Integer findUserNums(Integer cId,String role){
        return userCourseDao.findUserNums(cId,role);
    }
    public void sortCourse(String classPaiNum, Integer cId, Integer serialNumber){
        userCourseDao.sortCourse(classPaiNum,cId,serialNumber);
    }

    public UserCourse findOneUserCourse(String classPaiNum, Integer cId){
        return userCourseDao.findOneUserCourse(classPaiNum,cId);
    }
}
