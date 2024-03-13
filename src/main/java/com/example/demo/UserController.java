package com.example.demo;

import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hallo")
    public String hallo(){
        System.out.println("wtf???????");
        //就是这个语句有问题
        User user = userMapper.selectById("1");
        System.out.println(user);

        return "success";
    }
}
