package com.gaoxiong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author gaoxiong
 * @ClassName App
 * @Description
 * @date 2019/10/11 14:13
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.gaoxiong.mapper"})
public class App {
    public static void main ( String[] args ) {
        SpringApplication.run(App.class, args);
    }
}
