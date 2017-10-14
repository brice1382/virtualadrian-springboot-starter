package com.virtualadrian;

import com.virtualadrian.config.RestApiConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.virtualadrian.config.JpaDatasourceConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import com.virtualadrian.config.SwaggerConfig;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@Import({ JpaDatasourceConfiguration.class, SwaggerConfig.class, RestApiConfiguration.class})
@SpringBootApplication(scanBasePackages={"com.virtualadrian"})
@RestControllerAdvice
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}

