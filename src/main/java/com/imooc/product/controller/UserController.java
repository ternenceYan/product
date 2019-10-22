package com.imooc.product.controller;

import com.imooc.product.pojo.SysUser;
import com.imooc.product.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private UserService userService;

    @RequestMapping("getUserById/{userid}")
    public List<SysUser> getUserById(@PathVariable String userid) throws Exception {

        List<SysUser> userList = userService.getUserById(userid);
        logger.info("根据id获取用户信息...........................");
        return userList;
    }
}
