package com.example.withfetch.demos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Data {
    @GetMapping("/data")
    public String data(){
        return "instoreData.html";
    }
}
