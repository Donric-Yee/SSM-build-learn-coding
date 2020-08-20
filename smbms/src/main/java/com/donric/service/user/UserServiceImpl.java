package com.donric.service.user;

import com.donric.dao.BaseDao;
import com.donric.dao.user.UserDao;
import com.donric.dao.user.UserDaoImpl;
import com.donric.pojo.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    // 业务层都会调用dao层，所以我们要引用Dao层
    private UserDao userDao;
    // 无参构造
    public UserServiceImpl(){
        userDao = new UserDaoImpl();
    }


    public User login(String userCode, String password) {
        Connection connection = null;
        User user = null;

        try {
            connection = BaseDao.getConnection();
            user = userDao.getLoginUser(connection, userCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResources(connection,null,null);
        }
        return user;
    }
    @Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        User admin = userService.login("admin", "1234567");
        System.out.println(admin.getUserPassword());
    }
}
