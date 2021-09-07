package com.example.shoppingdataprovider;

import com.example.shoppingdataprovider.entity.*;
import com.example.shoppingdataprovider.mapper.UserLogMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huhaiyang
 * @date 2021/9/6
 */
@SpringBootTest
public class TestGetData {
    @Autowired
    UserLogMapper userLogMapper;
    @Test
    public void getData(){
        List<CompareProvince> result = new ArrayList<>();
        result = userLogMapper.getCompareProvince();
        System.out.println(1);
    }

}
