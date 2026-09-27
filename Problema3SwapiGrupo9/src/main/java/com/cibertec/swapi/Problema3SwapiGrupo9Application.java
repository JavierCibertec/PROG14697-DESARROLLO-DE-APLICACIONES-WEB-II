package com.cibertec.swapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Problema3SwapiGrupo9Application {

    public static void main(String[] args) {
        SpringApplication.run(Problema3SwapiGrupo9Application.class, args);
    }
}
