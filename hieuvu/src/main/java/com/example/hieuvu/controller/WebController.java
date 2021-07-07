package com.example.hieuvu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }
    @GetMapping({"sell"})
    public String sellProduct() {
        return "sell";
    }


}