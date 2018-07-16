package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld() {

        return "FOR EVERYONE";
    }

    @GetMapping("table")
    public String table1() {

        return "table1";
    }

    @GetMapping("/admin")
    @ResponseBody
    public String admin(){

        return "Admin panel";
    }

    @GetMapping("/remove")
    @ResponseBody
    public String remove(){

        return "Remove";
    }

}
