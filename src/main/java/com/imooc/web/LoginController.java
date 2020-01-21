package com.imooc.web;

import com.imooc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/logined")
    public String logined(@RequestParam("username")String username,
                          @RequestParam("password")String password,
                            HttpSession session){

        System.out.println(username);
        System.out.println(password);


        if(username.equals("hello") && password.equals("111")){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            session.setAttribute("session_user",user);
            return "redirect:user/serch";
        }else{
            return "login";
        }


    }


}
