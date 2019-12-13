package com.uscilims;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.uscilims")
@SpringBootApplication
public class CasereportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CasereportApplication.class, args);
    }

}
