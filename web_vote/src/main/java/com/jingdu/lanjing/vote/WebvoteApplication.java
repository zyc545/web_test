package com.jingdu.lanjing.vote;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jingdu.lanjing.**")
public class WebvoteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebvoteApplication.class, args);
    }

}
