package com.spring.practice.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApiController {

    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    private String helloworldString(){
        return "helloworld";
    }

    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    public Hello hellowolrdJson(){
        Hello hello = new Hello();
        hello.message = "hello world";
        return hello;
    }

    @GetMapping(value = "/helloworld/page")
    public String hellowolrd(){
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello{
        private String message;
    }
}
