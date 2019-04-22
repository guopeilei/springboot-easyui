package com.service.impl;

import com.domain.entity.User;
import com.domain.mapper.UserMapper;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User getUser(Integer id) {
        User user = userMapper.getOne(id);
        return user;
    }


    /**
     * 根据登录名
     * 检查用户是否存在，如果不存在的话提醒用户注册，
     * @param userName 用户登录名
     * @return 返回boolean类型的值，TRUE表示存在
     */
    public User getUserByLoginName(String userName){
        User user = userMapper.getUserByUserName(userName);
        if(user==null){
            return null;
        }
        return user;
    }

}
