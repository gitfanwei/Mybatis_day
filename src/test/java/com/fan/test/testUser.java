package com.fan.test;

import com.fan.IUserMapper.UserMapper;
import com.fan.SessionFactory_.SessFactory;
import com.fan.user.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @Test//查询单条语句
    public void  test5(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userID = mapper.getUserID(91);
        System.out.println(userID);
        sqlSession.close();
    }
    @Test
    public void test6(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         Map<String,Object> map=new HashMap<String, Object>();
         map.put("namee","zhangsna");
         map.put("ide",50);
        mapper.getadd(map);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test7(){
        SqlSession sqlSession = SessFactory.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("na","小范");
        map.put("di",10);
        mapper.getUpdaUser(map);
        sqlSession.commit();
        sqlSession.close();
    }

}
