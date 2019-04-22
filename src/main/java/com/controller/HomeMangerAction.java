package com.controller;

import com.domain.entity.*;
import com.service.LoginService;
import com.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeMangerAction {
    @Autowired
    private LoginService loginService;
    @Autowired
    private UserStatusSession userStatusSession;

    @Autowired
    private MenuService menuService;
    @RequestMapping("/home")
    public String home(Model model) {
        List<Menu> menus = menuService.getAllMenu();
        model.addAttribute("menus",menus);
        return "managerHome";
    }
    @RequestMapping("/info")
    public String infomain() {
        return "information";
    }
}
