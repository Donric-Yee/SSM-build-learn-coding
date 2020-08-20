package com.donric.service;

import com.donric.dao.UserDaoMysqlImpl;

public interface UserService {
    void setUserDao(UserDaoMysqlImpl userDao);
    void getUser();
}
