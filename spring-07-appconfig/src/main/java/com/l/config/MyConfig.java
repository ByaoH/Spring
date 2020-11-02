package com.l.config;

import com.l.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.l.pojo"})
@Import({MyConfig2.class})
public class MyConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
