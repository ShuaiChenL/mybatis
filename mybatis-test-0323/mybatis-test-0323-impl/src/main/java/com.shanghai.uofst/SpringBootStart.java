package com.shanghai.uofst;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author chenshuai
 * @data 2019/3/23 14:52
 */
@SpringBootApplication
@MapperScan("com.shanghai.uofst.dao.course")
public class SpringBootStart {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootStart.class, args);
    }
}
