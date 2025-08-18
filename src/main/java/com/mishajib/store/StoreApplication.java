package com.mishajib.store;

import com.mishajib.store.entities.*;
import com.mishajib.store.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.math.BigDecimal;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        var category = Category.builder()
                .name("Category1")
                .build();
        var product = Product.builder()
                .name("Product1")
                .price(new BigDecimal("10000"))
                .build();

        category.addProduct(product);

        System.out.println(category);
    }

}
