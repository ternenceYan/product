package com.imooc.product.service;

import com.imooc.product.pojo.SysUser;

import java.util.List;

public interface UserService {
    List<SysUser> getUserById(String userid) throws Exception;
}
