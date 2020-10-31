package com.l.service;

import com.l.dao.UserDao;
import com.l.dao.UserDaoImpl;
import com.l.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
