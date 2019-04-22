package com.domain.mapper;

import com.domain.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {
    @Select("SELECT userid,username,password,roleid FROM user WHERE userid =#{userid}")
    User getOne(Integer userid);

    @Select("SELECT userid,username,password,roleid FROM user WHERE username =#{username}")
    User getUserByUserName(String username);

    @Select("SELECT * FROM user")
    List<User> getAll();


    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Integer id);

    @Insert("INSERT INTO user(name,passwd,appid) VALUES(#{name}, #{passwd}, #{appid})")
    void insert(User user);

}
