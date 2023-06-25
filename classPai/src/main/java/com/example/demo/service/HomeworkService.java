package com.example.demo.service;

import com.example.demo.entity.homework;
import com.example.demo.entity.superHomework;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface HomeworkService {
    void insertHomework(homework homework);
    List<superHomework> findCourseHomework(Integer cId);
    superHomework findOneCourseHomework(Integer cId, Integer hId, String classPaiNum);
}
