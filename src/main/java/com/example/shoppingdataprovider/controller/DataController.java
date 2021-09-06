package com.example.shoppingdataprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huhaiyang
 * @date 2021/9/6
 */
@RestController
public class DataController {
    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }
}
