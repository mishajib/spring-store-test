package com.mishajib.store;

import com.mishajib.store.entities.Address;
import com.mishajib.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var user = User.builder()
                .name("John")
                .email("john@example.com")
                .password("12345")
                .build();
        var address = Address.builder()
                .street("123 Main St")
                .city("Main St")
                .state("Main St")
                .zip("12345")
                .build();

        user.addAddress(address);

        System.out.println(user);
    }

}
