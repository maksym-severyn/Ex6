package com.infoshareacademy.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MapperConfig {

    @Bean
    @Primary
    public ObjectMapper objectMapper(){
        ObjectMapper om = new ObjectMapper();
       om.enable(SerializationFeature.INDENT_OUTPUT);
       return om;
    }
}
