package com.learn.investor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/investor/current/")
public class GetCurrentStockValueController {

    @GetMapping
    public String getCurrentStockValue() {
        
        return "dummy";
    }
}
