package com.l;

import com.l.dao.UserDaoImpl;
import com.l.dao.UserDaoOracleImpl;
import com.l.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
