package com.lastdocha2.finaldocha2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class Finaldocha2Application {

    public static void main(String[] args) {
        SpringApplication.run(Finaldocha2Application.class, args);
    }

}
