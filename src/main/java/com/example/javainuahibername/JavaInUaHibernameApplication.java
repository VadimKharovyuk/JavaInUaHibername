package com.example.javainuahibername;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaInUaHibernameApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaInUaHibernameApplication.class, args);


        Service service = new Service();
        service.save();
    }



}
