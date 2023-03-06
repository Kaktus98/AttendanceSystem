package com.finalthesis.AttendanceSystem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // povoli pristup z lubovolnej domeny
                //.allowedOrigins("http://localhost:3000") // povoli pristup len z konkretnych domen
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("Content-Type", "Authorization", "Content-Length", "X-Requested-With")
                .maxAge(3600);
    }
}
