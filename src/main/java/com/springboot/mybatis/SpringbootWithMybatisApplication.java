package com.springboot.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.springboot.mybatis.dao.mapper")
public class SpringbootWithMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootWithMybatisApplication.class, args);
    }
}
