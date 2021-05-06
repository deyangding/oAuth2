package com.demo.dao;


import com.demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    User findByUserName(String userName);
}
