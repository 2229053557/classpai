package com.example.demo.dao;

import com.example.demo.entity.homework;
import com.example.demo.entity.superHomework;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value="HomeworkDao")
public interface HomeworkDao {
    void insertHomework(homework homework);
    List<superHomework> findCourseHomework(Integer cId);
    superHomework findOneCourseHomework(Integer cId, Integer hId, String classPaiNum);
}
