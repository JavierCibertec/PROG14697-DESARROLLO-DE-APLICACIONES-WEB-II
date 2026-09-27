package com.example.t1_feigngrupo9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class T1FeignGrupo9Application {

    public static void main(String[] args) {
        SpringApplication.run(T1FeignGrupo9Application.class, args);
    }

}
