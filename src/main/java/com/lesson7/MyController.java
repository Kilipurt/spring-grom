package com.lesson7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @RequestMapping(method = RequestMethod.GET, value = "/testMvc")
//    @ResponseBody
    public String testMvc() {
        return "home";
    }
}
