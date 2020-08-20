package com.donric.service.user;

import com.donric.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode,String password);
}
