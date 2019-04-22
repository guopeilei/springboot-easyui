package com.domain.mapper;

import com.domain.entity.Menu;
import com.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 菜单查询
 */
@Mapper
@Component(value = "menuMapper")
public interface MenuMapper {

    /**
     * 状态废弃的不查询
     * @return
     */
    @Select("SELECT id,parentid,name,url,status,image ,createtime,updatetime,isleaf FROM menu WHERE status ='1'")
    List<Menu> getAllMenu();

    @Select("SELECT userid,username,password,roleid FROM user WHERE username =#{username}")
    User getUserByUserName(String username);

    @Select("SELECT * FROM user")
    List<User> getAll();
}
