package com.stu.shortvideo.aspect;

import com.stu.shortvideo.utils.Rest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import com.stu.shortvideo.aspect.LoginException;

@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = LoginException.class)
    @ResponseBody
    public Rest<String> handleLoginException(LoginException e) {
        return new Rest<>(e.getErrCode(), e.getInfo(), null);
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Rest<String> exceptionHandle(Exception e) {
        e.printStackTrace();
        return new Rest<>(500,"未知错误",null);
    }


}
