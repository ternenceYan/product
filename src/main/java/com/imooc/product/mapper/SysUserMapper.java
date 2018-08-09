package com.imooc.product.mapper;

import com.imooc.product.pojo.SysUser;
import com.imooc.product.utils.MyMapper;

import java.util.List;

public interface SysUserMapper extends MyMapper<SysUser> {
    List<SysUser> getSysUserById(String id) throws Exception;
}