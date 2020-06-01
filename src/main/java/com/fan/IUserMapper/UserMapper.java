package com.fan.IUserMapper;

import com.fan.user.User;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    //第五步 创建实体类的接口
    List<User> getUserMapper();

    //做一个id查询
    User getUserID(int id);
    int insertUser(User user);
    int getDeleteUser(int idd);
    int getUpdateUser(User user);
    int getadd(Map<String,Object> map);
    int getUpdaUser(Map<String,Object> map);

}
