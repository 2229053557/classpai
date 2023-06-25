package com.example.demo.dao;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value="UserDao")
public interface UserDao {
    User loadUserByMailboxOrTel(String mailboxOrTel);
    int insertUse(User user);
    int deleteByMailboxOrTel(String mailboxOrTel);
    int updateUser(User user);
    User selectByMailboxOrTel(String mailboxOrTel);
    User findUserByClassPaiNum(String classPaiNum);
}
