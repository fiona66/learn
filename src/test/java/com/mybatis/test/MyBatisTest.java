package com.mybatis.test;

import com.mybatis.domain.User;
import com.mybatis.domain.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MyBatisTest {
    private static SqlSessionFactory getSessionFactory()
    {
        SqlSessionFactory sessionFactory = null;
        String resource = "configuration.xml";
        try {
            sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(
                    resource));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory;
    }

    public static void main(String[] args) {
        SqlSession sqlSession = getSessionFactory().openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.findById("1");
        System.out.println(user.getUserName());
        System.out.println(user.getUserAge());
        System.out.println(user.getUserAddress());
    }

}
