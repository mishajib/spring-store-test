package com.mishajib.store;

import com.mishajib.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = new User(1L, "John Doe", "john@example.com", "john123");
        user.setName("John Doe");
        user.setEmail("john@example.com");
        user.setPassword("john123");
    }

}
