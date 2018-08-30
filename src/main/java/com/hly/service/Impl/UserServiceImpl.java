package com.hly.service.Impl;

import com.hly.dao.UserDao;
import com.hly.entity.User;
import com.hly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author :hly
 * @github :github.com/SiriusHly
 * @blog :blog.csdn.net/Sirius_hly
 * @date :2018/8/30
 */
public class UserServiceImpl implements UserService {


    @Autowired
    UserDao userDao;


    @Override
    public User getUserById(String userId) {
        return userDao.getByUserId(userId);
    }
}
