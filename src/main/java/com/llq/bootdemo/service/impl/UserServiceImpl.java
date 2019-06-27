package com.llq.bootdemo.service.impl;

import com.llq.bootdemo.dao.UserDao;
import com.llq.bootdemo.entity.User;
import com.llq.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public User queryUserList(Long id) {
        if(null != id){
            return userDao.selectByPrimaryKey(1l);
        }
        return null;
    }
}
