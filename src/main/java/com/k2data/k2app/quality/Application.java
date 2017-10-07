package com.k2data.k2app.quality;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Log4j2
@SpringBootApplication
@EnableTransactionManagement
public class Application {
    /**
     * Spring Boot 启动入口
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("----------------start success-------------------");
    }
}
