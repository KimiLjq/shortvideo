package com.stu.shortvideo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.stu.shortvideo.*"})
@MapperScan(basePackages = "com.stu.shortvideo.dao")
public class ShortvideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShortvideoApplication.class, args);
    }

}
