package com.example.demo.dao;

import com.example.demo.entity.UserCourseHomework;
import com.example.demo.entity.superUserHomework;
import com.example.demo.util.ListTypeHandler;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Mapper
@Component(value="UserCourseHomeworkDao")
public interface UserCourseHomeworkDao {
    Integer findSubmitNums(Integer hId,Integer cId,String isAlreadySubmit);
    Integer findCorrectingNums(Integer hId,Integer cId,String isAlreadyCorrecting);
    void submitHomework(UserCourseHomework userCourseHomework);
    UserCourseHomework findOneUserCourseHomework(Integer hId,Integer cId,String classPaiNum);
    void reSubmitHomework(UserCourseHomework userCourseHomework);
    void subAchievement(UserCourseHomework userCourseHomework);
    List<superUserHomework> findAllUserHomework(Integer hId,Integer cId,String role);
}
