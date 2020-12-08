package com.stu.shortvideo.controller;

import com.stu.shortvideo.aspect.LoginException;
import com.stu.shortvideo.entity.vo.UserVo;
import com.stu.shortvideo.service.UserService;
import com.stu.shortvideo.utils.Rest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (User)表控制层
 *
 * @author kimijiaqili
 * @since 2020-12-08 13:12:00
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Rest<UserVo> selectOne(Integer id) throws LoginException {
        return this.userService.queryById(id);
    }

    @RequestMapping("/queryUserByUsername")
    @ResponseBody
    public Rest<UserVo> queryUserByUsername(String username) throws LoginException {
        return this.userService.queryUserByUsername(username);
    }

    @RequestMapping("/queryUserByEmail")
    @ResponseBody
    public Rest<UserVo> queryUserByEmail(String email) throws LoginException {
        return this.userService.queryByEmail(email);
    }

    @RequestMapping("/login")
    @ResponseBody
    public Rest<UserVo> login(String mail, String password) throws LoginException {
        return this.userService.login(mail, password);
    }

    @RequestMapping("/register")
    @ResponseBody
    public Rest<UserVo> register(String username, String email, String password, String verification) throws LoginException {
        return this.userService.register(username, email, password, verification);
    }

}