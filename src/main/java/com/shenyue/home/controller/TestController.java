package com.shenyue.home.controller;

import com.shenyue.home.dao.TestMapper;
import com.shenyue.home.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName: com.shenyue.home.controller
 * @Description:
 * @author: 罗绂威
 * @date: 2019/6/13
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Autowired
     TestMapper testMapper;

    @RequestMapping("/test")
    public List<Test> test(){
//        return "1";
        return testMapper.getAll();
    }
}
