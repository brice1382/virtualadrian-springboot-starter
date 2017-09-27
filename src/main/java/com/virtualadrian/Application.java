package com.virtualadrian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.virtualadrian.config.ServerMonitorRepositoryConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;
import com.virtualadrian.config.SwaggerConfig;

@Import({ServerMonitorRepositoryConfiguration.class, SwaggerConfig.class})
@SpringBootApplication(scanBasePackages={"com.virtualadrian"})
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
//
//{
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//    }
//}
