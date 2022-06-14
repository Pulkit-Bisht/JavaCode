package com.Oodles.jwt_token.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String welcome(){
        return "Hello Pushkar";
    }

    @RequestMapping(value = "/onemore",method = RequestMethod.GET)
    public String oneMore(){
        return "One more Check";
    }
}
