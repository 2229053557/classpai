package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.UUID;

@Service
public class UserServiceBean implements UserService, UserDetailsService {
    @Autowired
    UserDao userDao;

    @Resource(name = "defaultPasswordEncoder")
    PasswordEncoder passwordEncoder;

    @Override
    public int insertUse(User user) {
        String password = user.getPassword();
        String newPassword = passwordEncoder.encode(password);
        user.setPassword(newPassword);
        String classPaiNum = "ktp"+ UUID.randomUUID().toString().substring(0,8);
        user.setClassPaiNum(classPaiNum);
        user.setHeadPortrait("http://localhost:8081/月儿.jpg");
        this.userDao.insertUse(user);
        return 0;
    }

    @Override
    public int deleteByMailboxOrTel(String mailboxOrTel) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String password= user.getPassword();
        String newPassword = encoder.encode(password);
        user.setPassword(newPassword);
        this.userDao.updateUser(user);
        return 0;
    }

    @Override
    public User selectByMailboxOrTel(String mailboxOrTel) {
        return null;
    }


    @Override
    public UserDetails loadUserByUsername(String mailboxOrTel) throws UsernameNotFoundException {
        User user = userDao.loadUserByMailboxOrTel(mailboxOrTel);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        return user;
    }

    public User findUserByClassPaiNum(String classPaiNum){
        return userDao.findUserByClassPaiNum(classPaiNum);
    }
}
