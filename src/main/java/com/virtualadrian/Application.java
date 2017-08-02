package com.virtualadrian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.virtualadrian.config.ServerMonitorRepositoryConfiguration;
import org.springframework.context.annotation.Import;

/**
 * The type Application.
 */
@Import({ServerMonitorRepositoryConfiguration.class, SwaggerConfig.class})
@SpringBootApplication(scanBasePackages={"com.virtualadrian"})
public class Application {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
