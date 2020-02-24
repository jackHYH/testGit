package yong.hui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
        //返回WEB_INF/pages/home.jsp
        //使用分支
        //使用分支提交和合并
         //使用分支提交和合并
         //使用分支提交和合并
        //12
        //23
        int a =20;
        return "home";
    }
}
