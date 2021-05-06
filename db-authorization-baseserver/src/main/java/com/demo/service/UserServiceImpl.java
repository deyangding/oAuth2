package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User getByUserName(String userName) {
        return userDao.findByUserName(userName);
    }
}
