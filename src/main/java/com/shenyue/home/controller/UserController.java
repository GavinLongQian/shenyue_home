package com.shenyue.home.controller;

import com.shenyue.home.dao.UserMapper;
import com.shenyue.home.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @PackageName: com.shenyue.home.controller
 * @Description:
 * @author: 罗绂威
 * @date: 2019/6/14
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getAll")
    public List<UserEntity> getAll(){
        return userMapper.getAll();
    }
}
