package com.imooc.product.service.Impl;


import com.imooc.product.mapper.SysUserMapper;
import com.imooc.product.pojo.SysUser;
import com.imooc.product.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public UserServiceImpl() {
    }

    @Override
    public List<SysUser> getUserById(String userid) throws Exception {

        List<SysUser> userList = sysUserMapper.getSysUserById(userid);
        return userList;
    }

}
