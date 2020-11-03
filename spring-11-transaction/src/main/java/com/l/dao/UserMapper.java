package com.l.dao;

import com.l.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface UserMapper {
    List<User> selectUser();

//    添加一个用户
    @Insert("insert into user(id, name, pwd) values (#{id}, #{name}, #{pwd})")
    int addUser(User user);

//    删除一个用户
    @Delete("deletes from user where id = #{id}")
    int deleteUser(int id);
}
