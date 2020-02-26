package yong.hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author hyh
 * @version V1.0
 * @Package yong.hui.controller
 * @date 2020/2/24 14:57
 * @Copyright © 2019.12.2
 */
@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    
    @RequestMapping("/changeName1/{username}/{age}")
    @ResponseBody
    public String ChangeName1(@PathVariable String username,@PathVariable int age){
        System.out.println(username);
        System.out.println(age);
        return username;
    }

}
