package com.chatgroup.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/chatapp")
public class test {
    @GetMapping("/greet")
    public String greet(){
        return "hii there bro";
    }
    @GetMapping("/sayhii")
    public String hii(){
        return "hii there here is you hii";
    }
}
