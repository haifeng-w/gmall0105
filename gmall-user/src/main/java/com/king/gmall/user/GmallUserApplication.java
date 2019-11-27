package com.king.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("D:\\IdeaProjects\\gmall0105\\gmall-user\\src\\main\\java\\com\\king\\gmall\\user\\mapper")
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
