package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
    int insertUse(User user);
    int deleteByMailboxOrTel(String mailboxOrTel);
    int updateUser(User user);
    User selectByMailboxOrTel(String mailboxOrTel);
    User findUserByClassPaiNum(String classPaiNum);
}
