package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoManagerAction {
    @RequestMapping("/getAllVideoInfo")
    public String getEmployeeInfo() {
        return "videoManager";
    }
}
