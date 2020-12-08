package com.stu.shortvideo.utils;

import com.fasterxml.jackson.annotation.JsonValue;

public enum RestCode {
    SUCCEED(200, "请求成功"),
    UNKNOWN(500, "未知错误"),
    DATA_CONTENT_EXCEPTION(510, "数据有误！");

    private final int code;
    private final String defaultMsg;

    RestCode(int code, String defaultMsg) {
        this.code = code;
        this.defaultMsg = defaultMsg;
    }

    @JsonValue
    public int getCode() {
        return code;
    }

    public String getDefaultMsg() {
        return defaultMsg;
    }
}
