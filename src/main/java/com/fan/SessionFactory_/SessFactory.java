package com.fan.SessionFactory_;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SessFactory {
    private static SqlSessionFactory sqlSessionFactory;
   private static InputStream inputStream;

   static  {
       //三步 建造工厂导入第二部的MySQL的相关数据的xml文件
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  static SqlSession getSqlSession(){
       return sqlSessionFactory.openSession();
    }

}
