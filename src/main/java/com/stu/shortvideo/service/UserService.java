package com.stu.shortvideo.service;

import com.stu.shortvideo.aspect.LoginException;
import com.stu.shortvideo.entity.vo.UserVo;
import com.stu.shortvideo.utils.Rest;

public interface UserService {
    // 根据Id查询用户信息
    Rest<UserVo> queryById(Integer id) throws LoginException;

    // 根据用户名查找用户
    Rest<UserVo> queryUserByUsername(String userName) throws LoginException;

    Rest<UserVo> queryByEmail(String email) throws LoginException;

    // 用户登录
    Rest<UserVo> login(String email, String password) throws LoginException;

    // 用户注册
    Rest<UserVo> register(String username, String email, String password, String verification) throws LoginException;
}
