package com.imooc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/serch")
    public String serch(){
        System.out.println("serch方法");
        return "user/serch";
    }

    @RequestMapping("/updatePwd")
    public String updatePwd(){
        System.out.println("updatePwd方法");
        return "user/updatePwd";
    }

    @RequestMapping("/updatePic")
    public String updatePic(){
        System.out.println("updatePic方法");
        return "user/updatePic";
    }



}
