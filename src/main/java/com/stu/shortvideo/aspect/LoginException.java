package com.stu.shortvideo.aspect;

public class LoginException extends Exception{
    static final long serialVersionUID = 1L;
    private int errCode = 400;
    private String info = "未定义逻辑错误信息";

    public LoginException(int errCode, String info) {
        this.errCode = errCode;
        this.info = info;
    }

    public void printStackTrace() {
        System.out.println("错误代码：" + errCode + "  错误信息：" + info);
        super.printStackTrace();
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
