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
        sqlSession.close();
    }
    @Test//向数据库插入数据
    public  void  test2(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.insertUser(new User("张二","男",91,"白嫖"));
        sqlSession.commit();
        sqlSession.close();
    }
    @Test //删除数据库中的数据
    public void test3(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getDeleteUser(90);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test //修改表中的数据
    public  void  test4(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.getUpdateUser(new User("老王","女",91,"买"));
        sqlSession.commit();
        sqlSession.close();
    }


}
