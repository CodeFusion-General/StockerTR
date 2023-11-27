package com.codefusion.stockerbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class StockerBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockerBackendApplication.class, args);
    }

}

/*exclude = DataSourceAutoConfiguration.class*/