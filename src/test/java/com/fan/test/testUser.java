package com.fan.test;

import com.fan.IUserMapper.UserMapper;
import com.fan.SessionFactory_.SessFactory;
import com.fan.user.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testUser {
    @Test
    public  void test(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userMapper = mapper.getUserMapper();
        for (User user : userMapper) {
            System.out.println(user);
        }
    }
}
