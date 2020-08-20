package com.donric.dao;

import com.donric.pojo.User;
import com.donric.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
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
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        // 获得接口
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);

        sqlSession.close();
    }

// 增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.addUser(new User(8,"donric01","12342134"));

        if(res>0){
            System.out.println("插入成功！");
        }
        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void addUser1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid",12);
        map.put("userpwd","123");
        mapper.addUser1(map);


        sqlSession.commit();
        sqlSession.close();

    }

    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(3,"呵呵","111111"));

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(1);

        sqlSession.commit();
        sqlSession.close();
    }
}


