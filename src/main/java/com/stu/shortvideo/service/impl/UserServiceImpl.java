package com.stu.shortvideo.service.impl;

import com.stu.shortvideo.aspect.LoginException;
import com.stu.shortvideo.dao.UserDao;
import com.stu.shortvideo.entity.User;
import com.stu.shortvideo.entity.vo.UserVo;
import com.stu.shortvideo.service.UserService;
import com.stu.shortvideo.utils.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private UserDao userDao;

    // 根据id查询用户信息
    @Override
    public Rest<UserVo> queryById(Integer id) throws LoginException {
        User user = this.userDao.queryById(id);
        if (user == null) {
            throw new LoginException(502, "此用户不存在");
        }
        return new Rest<>(200,"success",user.transferToUserVo());
    }

    @Override
    public Rest<UserVo> queryUserByUsername(String userName) throws LoginException {
        return null;
    }

    public Rest<UserVo> queryByEmail(String email) throws LoginException {
        return null;
    }

    @Override
    public Rest<UserVo> login(String email, String password) throws LoginException {
        User user = this.userDao.selectByEmail(email);
        if (user == null) throw new LoginException(502, "未找到该用户");
        else if (!user.getPassword().equals(password)) throw new LoginException(503, "输入密码错误");

        return new Rest<>(200, "success", user.transferToUserVo());
    }

    @Override
    public Rest<UserVo> register(String username, String email, String password, String verification) throws LoginException{
        if (this.userDao.selectByEmail(email) != null) throw new LoginException(504, "该账号已存在");
        else if (this.userDao.selectByUsername(username) != null) throw new LoginException(505, "该用户名已存在");
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserType(1);
        this.userDao.insert(user);
        userDao.insert(user);

        return new Rest<>(200, "success", user.transferToUserVo());
    }


}
