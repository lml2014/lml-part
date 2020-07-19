package com.lml.part.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shuishan
 * @date 2020/4/4
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/say")
    @ResponseBody
    public Object say() {
        return "say hello";
    }

}
