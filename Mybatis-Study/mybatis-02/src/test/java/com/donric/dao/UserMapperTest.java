package com.donric.dao;

import com.donric.pojo.User;
import com.donric.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void test(){
        //获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭SqlSession
            sqlSession.close();
        }

    }

    @Test
    public void testlog4j(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }

}


