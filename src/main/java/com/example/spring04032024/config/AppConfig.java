package com.example.spring04032024.config;

import com.example.spring04032024.BMW;
import com.example.spring04032024.DieselEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public DieselEngine getDieselEngine(){
        return new DieselEngine();
    }
    @Bean
    public BMW x8(){
        BMW bmw = new BMW(1500, getDieselEngine());
        bmw.setName("X8");
        return bmw;
    }

}
