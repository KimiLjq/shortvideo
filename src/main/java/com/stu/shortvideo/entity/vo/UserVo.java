package com.stu.shortvideo.entity.vo;

import java.util.Date;

public class UserVo {
    private static final long serialVersionUID = 584223424916485690L;
    /**
     * 用户ID，自动递增
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 头像url
     */
    private String avatarUrl;
    /**
     * 用户类型：1平台账号、2微信、3QQ
     */
    private Object userType;
    /**
     * 用户手机号码
     */
    private Integer telNum;
    /**
     * 邮件
     */
    private String email;
    /**
     * 注册时间
     */
    private Date registerTime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Object getUserType() {
        return userType;
    }

    public void setUserType(Object userType) {
        this.userType = userType;
    }

    public Integer getTelNum() {
        return telNum;
    }

    public void setTelNum(Integer telNum) {
        this.telNum = telNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}
