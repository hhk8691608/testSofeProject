package com.ace.jenkins.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/index")
public class indexController {

    @GetMapping(path = "login")
    public Map<String,Object> login(@RequestParam(value = "mobile", defaultValue = "110") Integer mobile){
        Map<String,Object> result = new HashMap<>();
        result.put("mobile",mobile);
        return result;
    }

}
