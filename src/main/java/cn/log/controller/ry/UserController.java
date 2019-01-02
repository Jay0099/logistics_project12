package cn.log.controller.ry;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

   @RequestMapping("/login")
    public String login(){
       System.out.println(11111);
       return "login";
   }
    @RequestMapping(value = "/indexs")
    public String index(){
        System.out.println(222222);
        return "index";
    }
}
