package com.example.shoppingdataprovider.controller;

import com.example.shoppingdataprovider.entity.*;
import com.example.shoppingdataprovider.mapper.UserLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huhaiyang
 * @date 2021/9/6
 */
@RestController
public class DataController {
    @Autowired
    UserLogMapper userLogMapper;

    @RequestMapping("/analysisAction")
    public List<AnalysisAction> analysisAction(){
        return userLogMapper.getAnalysisAction();
    }

    @RequestMapping("/compareNum")
    public List<CompareNum> compareNum(){
        return userLogMapper.getCompareNum();
    }

    @RequestMapping("/compareAge")
    public List<CompareAge> compareAge(){
        return userLogMapper.getCompareAge();
    }

    @RequestMapping("/topProductCategory")
    public List<TopProductCategory> topProductCategory(){
        return userLogMapper.getTopProductCategory();
    }

    @RequestMapping("/compareProvince")
    public List<CompareProvince> compareProvinces(){
        return userLogMapper.getCompareProvince();
    }

    @RequestMapping("/hello")
    public String index(){
        return "hello";
    }
}
