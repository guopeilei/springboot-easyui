package com.controller;

import com.domain.entity.JsonResult;
import com.domain.entity.User;
import com.domain.entity.UserStatusSession;
import com.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginAction {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserStatusSession userStatusSession;

    @RequestMapping(value="/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam("id") Integer id) {
        User user=loginService.getUser(id);
        return user;
    }
    @RequestMapping("/login")
    public String hello() {
        return "login";
    }

    /**
     * 用户登录提交
     * @param paramUser  登录名
     * @return
     */
    @RequestMapping(value="/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(User paramUser){
        System.out.println("********************************************");
        JsonResult result = new JsonResult();
        result.setReturnCode("AAAAAAA");
        if(paramUser.getUsername()==null){
            result.setMessage("用户名为空");
            result.setReturnCode("000000");
        }
        if(paramUser.getPassword()==null){
            result.setMessage("用户密码为空");
            result.setReturnCode("000000");
        }
        if(paramUser.getPassword().length()<6){
            result.setMessage("用户密码长度小于6");
            result.setReturnCode("000000");
        }
        User user =  loginService.getUserByLoginName(paramUser.getUsername());
        if (user==null){
            result.setMessage("登录用户名不存在");
            result.setReturnCode("000000");

        }else {
            if(paramUser.getPassword().equals(user.getPassword())){
                result.setMessage("用户登录成功");
                result.setReturnCode("AAAAAA");
                userStatusSession.setLogin(true);
            }else {
                result.setMessage("登录用户密码不正确");
                result.setReturnCode("000000");
            }
        }
        return result;

    }
}
