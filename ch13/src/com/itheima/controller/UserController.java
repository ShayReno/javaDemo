package com.itheima.controller;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }
//    @RequestMapping("/select")
//    public  String  selectUser(HttpServletRequest request){
//        String id=request.getParameter("id");
//        System.out.println("id"+id);
//        return  "first";
//
//    }

    @RequestMapping("/registerUser")
    public String registerUser(User user){
        String username=user.getUsername();
        int pwd=user.getPassword();
        System.out.println("username:"+username);
        System.out.println("pwd:"+pwd);
        return  "first";
    }
}
