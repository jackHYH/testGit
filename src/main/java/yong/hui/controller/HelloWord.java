package yong.hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hyh
 * @version V1.0
 * @Package yong.hui.controller
 * @date 2020/2/26 10:15
 * @Copyright © 2019.12.2
 */
@Controller
public class HelloWord {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
