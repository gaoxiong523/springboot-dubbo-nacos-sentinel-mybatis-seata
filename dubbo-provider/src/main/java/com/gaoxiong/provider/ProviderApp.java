package com.gaoxiong.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gaoxiong
 * @ClassName ProviderApp
 * @Description
 * @date 2019/10/10 15:31
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApp {
    public static void main ( String[] args ) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
