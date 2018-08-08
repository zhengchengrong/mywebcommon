package com.zcr.myapp.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class MyAppController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/manage/log/index.jsp";
    }
}
