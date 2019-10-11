package com.gaoxiong.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.gaoxiong.provider.service.DemoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author gaoxiong
 * @ClassName ConsumerApp
 * @Description
 * @date 2019/10/10 15:46
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerApp {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            System.out.println(demoService.sayName("小马哥（mercyblitz）"));
        }
    }

    public static void main ( String[] args ) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
