package com.ryfj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renyan
 * @CreateTime: 2022-09-18  13:14
 * @Description: TODO
 * @Version: 1.0
 */

@RestController
@RequestMapping("/hello")
public class BaseDemoController {

    @GetMapping("/helloWorld")
    public String helloWorld(){
        return "Hello World!!!";
    }
}
