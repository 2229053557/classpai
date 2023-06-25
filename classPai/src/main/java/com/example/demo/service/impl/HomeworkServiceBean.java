package com.example.demo.service.impl;

import com.example.demo.dao.HomeworkDao;
import com.example.demo.entity.homework;
import com.example.demo.entity.superHomework;
import com.example.demo.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeworkServiceBean implements HomeworkService {
    @Autowired
    HomeworkDao homeworkDao;
    public void insertHomework(homework homework){
        homeworkDao.insertHomework(homework);
    }
    public List<superHomework> findCourseHomework(Integer cId){
        return homeworkDao.findCourseHomework(cId);
    }
    public superHomework findOneCourseHomework(Integer cId, Integer hId, String classPaiNum){
        return homeworkDao.findOneCourseHomework(cId,hId,classPaiNum);
    }
}
