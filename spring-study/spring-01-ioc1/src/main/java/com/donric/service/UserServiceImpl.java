package com.donric.service;

import com.donric.dao.UserDao;
import com.donric.dao.UserDaoImpl;
import com.donric.dao.UserDaoMysqlImpl;


public class UserServiceImpl implements UserService {

    private UserDaoMysqlImpl userDao;

    public void setUserDao(UserDaoMysqlImpl userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
