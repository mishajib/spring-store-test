package com.mishajib.store;

import com.mishajib.store.entities.*;
import com.mishajib.store.entities.User;
import com.mishajib.store.repositories.UserRepository;
import com.mishajib.store.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var service = context.getBean(UserService.class);
        service.showEntityStates();
    }

}
