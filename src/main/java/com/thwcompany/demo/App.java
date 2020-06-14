package com.thwcompany.demo;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Slf4j
@SpringBootApplication
//开启事物
@EnableTransactionManagement
@MapperScan("com.thwcompany.demo.dao")
public class App {

    public static void main(String[] args) {
       log.debug("容器启动。。。");
       SpringApplication.run(App.class, args);
    }

}
