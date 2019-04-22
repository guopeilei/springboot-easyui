package com.service;

import com.domain.entity.User;
import com.domain.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public interface LoginService {
    public User getUser(Integer id) ;
    /**
     * 根据登录名
     * 检查用户是否存在，如果不存在的话提醒用户注册，
     * @param userName 用户登录名
     * @return 返回boolean类型的值，TRUE表示存在
     */
    public User getUserByLoginName(String userName);
}

